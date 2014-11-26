/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andreas
 */
public class SpillerHandler {

    private DBHandler dbhandler;

    public SpillerHandler() {
        dbhandler = DBHandler.getInstance();
    }

    public SpillerProfil getSpiller(String cpr) {
        SpillerProfil resultat = null;
        try {
            String sql = "Select * From SpillerProfil Where cpr = '"+cpr+"';";
            Statement stmt = dbhandler.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                
            }
        } catch (SQLException ex) {
            System.out.println("SQLException" + ex.getMessage());
        }
        return resultat;
    }
}
