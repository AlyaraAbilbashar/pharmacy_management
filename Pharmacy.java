/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alyar
 */
public class Pharmacy {
    public static Connection ConnectorDb(){
        try{
           Class.forName("oracle.jdbc.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
           return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
