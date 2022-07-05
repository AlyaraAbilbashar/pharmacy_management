DECLARE 
c number;
BEGIN
c:= TOTAL_CUSTOMERS();
DBMS_OUTPUT.PUT_LINE('Total number of customers:' || c);
end;

DECLARE 
f_name customer.FIRST_NAME%TYPE;
l_name customer.LAST_NAME%TYPE;
med medicines.NAME%TYPE;
amount purchasing.amount%TYPE;
date purchasing.purchase_date%TYPE;
CURSOR purchase
IS
SELECT customer.FIRST_NAME , customer.LAST_NAME , medicines.NAME , purchasing.amount , purchasing.purchase_date 
FROM purchasing 
INNER JOIN customer ON (purchasing.customer_id = customer.CUST_ID)
INNER JOIN medicines ON (purchasing.medicine_id = medicines.medicine_id);
BEGIN
OPEN purchase;
LOOP
FETCH purchase into f_name, l_name, med, amount, date;
DBMS_OUTPUT.PUT_LINE(f_name || ' ' || l_name || ' ' || med || ' ' || amount || ' ' || date);
END LOOP;
CLOSE purchase;
END;

DECLARE BEGIN 
DELETE FROM CUSTOMER WHERE AGE>=61;
DBMS_OUTPUT.PUT_LINE('Total number of customers fired:' || SQL%ROWCOUNT);
EXCEPTION WHEN OTHERS THEN 
DBMS_OUTPUT.PUT_LINE('Exception when processing data: ' || SQLERRM);
end;

DECLARE BEGIN 
UPDATE SALES
SET total_amount = total_amount+500 WHERE MED_ID = 2;
EXCEPTION WHEN OTHERS THEN
DBMS_OUTPUT.PUT_LINE('Exception when processing data: ' || SQLERRM);
END;

SET SERVEROUTPUT ON
DECLARE 
date purchasing.purchase_date%TYPE;
s_count sales.count%TYPE;
f_name customer.FIRST_NAME%TYPE;
l_name customer.LAST_NAME%TYPE;
CURSOR report
IS
SELECT customer.FIRST_NAME , customer.LAST_NAME , sales.count , purchasing.purchase_date 
FROM reports 
INNER JOIN customer ON (reports.cust_id = customer.CUST_ID)
INNER JOIN sales ON (reports.sales_id = sales.sales_id)
INNER JOIN purchasing ON (reports.purchase_id = purchasing.purchase_id);
BEGIN
OPEN report;
LOOP
FETCH report into f_name, l_name, s_count, date;
DBMS_OUTPUT.PUT_LINE(f_name || ' ' || s_count || ' ' || date);
END LOOP;
CLOSE report;
END;
