/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class HoldHandler {
    
    private DBHandler dbhandler;

    public HoldHandler() {
        dbhandler = DBHandler.getInstance();
    }

    public Klub getKlubInfo(String klub) {
        Klub resultat = null;
        try {
            String sql = "Select * From Klub Where klubnavn = '"+klub+"';";
            Statement stmt = dbhandler.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String klubNavn = rs.getString("klubNavn");
                String adresse = rs.getString("adresse");
                int sejre = rs.getInt("sejre");
                int uafgjorte = rs.getInt("uafgjorte");
                int tabte = rs.getInt("tabte");
                int pointSum = rs.getInt("pointSum");
                int antalKampe = rs.getInt("antalKampe");
                int sæsonPlacering = rs.getInt("sæsonplacering");
                int antalMål = rs.getInt("antalMål");
                String trænerNavn = rs.getString("trænerNavn");
                Division divisionsnummer =  new Division(rs.getInt("divisionsnummmer"));
                
                Klub k1 = new Klub(klubNavn, adresse, sejre, uafgjorte, tabte, pointSum, antalKampe, sæsonPlacering, antalMål, trænerNavn, divisionsnummer);
                resultat = k1;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException" + ex.getMessage());
        }
        return resultat;
    }
}
