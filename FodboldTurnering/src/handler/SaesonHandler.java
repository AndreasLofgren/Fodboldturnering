/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import fodboldturnering.Saeson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andreas
 */
public class SaesonHandler {
    
    private DBHandler dbhandler;
    
    public SaesonHandler() {
        DBHandler.getInstance();
    }
    
    public Saeson getSaeson(String periode) {
        Saeson result = null;
        try {
            String sql = "Select * From Saeson Where periode = '" + periode + "';";
            Statement stmt = dbhandler.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            
            String sæson = rs.getString("periode");
            result = new Saeson(sæson);
            
        } catch (SQLException ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return result;
    }
    
}
