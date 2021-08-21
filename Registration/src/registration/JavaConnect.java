package registration;


import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    Connection conn=null;
    public static Connection connector1(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection c=DriverManager.getConnection("");
            JOptionPane.showMessageDialog(null, "Connected");
            return c;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
        }
    }
    







