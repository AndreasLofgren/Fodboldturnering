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

    private SpillerProfil spiller;
    private DBHandler dbhandler;

    public SpillerHandler() {
        dbhandler = new DBHandler();
    }

    public String getNavn(String sql) {
        String resultat = "";
        try {
            Connection conn = null;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int i = 1;

            while (rs.next()) {
                if (rs.getString(i).equals(spiller.getNavn())) {
                    resultat = rs.getString(i);
                } else {
                    i++;
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("SQLException" + ex.getMessage());
        }
        return resultat;
    }
}
