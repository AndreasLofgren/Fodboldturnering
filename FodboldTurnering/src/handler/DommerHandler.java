/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import fodboldturnering.Dommer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andreas
 */
public class DommerHandler {

    private DBHandler dbhandler;

    public DommerHandler() {
        DBHandler.getInstance();
    }

    public Dommer getDommer(String navn) {
        Dommer d = null;
        try {
            String sql = "Select * From Dommer Where navn = '" + navn + "';";
            Statement stmt = dbhandler.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            String dnavn = rs.getString("navn");

            d = new Dommer(dnavn);

        } catch (SQLException ex) {
            System.out.println("SQLException" + ex.getMessage());
        }
        return d;
    }
}
