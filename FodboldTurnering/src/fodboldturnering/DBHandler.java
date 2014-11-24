/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andreas
 */
public class DBHandler {

    private static DBHandler instance;
    private String url;
    private String brugernavn;
    private String password;

    public DBHandler() {
        url = "jdbc:mysql://localhost:3306/mycontacts";
        brugernavn = "root";
        password = "root";
    }

//    public static DBHandler getInstance() {
//        if (instance == null) {
//            instance = new DBHandler();
//        }
//        return instance;
//    }
    public void startForbindelse(String brugernavn, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection(url, brugernavn, password);
            Statement stmt = conn.createStatement();
            
        } catch (SQLException e) {
            System.out.println("SQLException" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found" + ex.getLocalizedMessage());
        }
    }
    
//    public void lukForbindelse() {
//        try {
//            startForbindelse(brugernavn, password);
//            conn.
//        }
//    }
}
