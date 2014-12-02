/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import fodboldturnering.Dommer;
import fodboldturnering.Kamprapport;
import fodboldturnering.Klub;
import fodboldturnering.Saeson;
import fodboldturnering.SpillerProfil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class KampHandler {

    private DBHandler dbhandler;
    private HoldHandler holdhandler;
    private SpillerHandler spillerhandler;
    private DommerHandler dommerhandler;

    public KampHandler() {
        dbhandler = DBHandler.getInstance();
        holdhandler = new HoldHandler();
        spillerhandler = new SpillerHandler();
        dommerhandler = new DommerHandler();

    }

    public ArrayList<Kamprapport> getKamprapporter(Saeson periode) {
        ArrayList<Kamprapport> resultat = new ArrayList<>();

        try {
            String sql = "Select * From Kamprapport;";
            Statement stmt = dbhandler.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String spilledag = rs.getString("spilledag");
                String tidspunkt = rs.getString("tidspunkt");
                String sted = rs.getString("sted");
                Klub hjemmehold = holdhandler.getKlubInfo(rs.getString("hjemmehold"));
                Klub udehold = holdhandler.getKlubInfo(rs.getString("udehold"));
                ArrayList<SpillerProfil> startOpstillingHjemme = new ArrayList<>();
                ArrayList<SpillerProfil> startOpstillingUde = new ArrayList<>();
                int antalTilskuer = rs.getInt("antalTilskuer");
                int runde = rs.getInt("runde");
                Dommer dommer = dommerhandler.getDommer(rs.getString("dommer"));

                Kamprapport k1 = new Kamprapport(spilledag, tidspunkt, sted, hjemmehold, udehold, startOpstillingHjemme, startOpstillingUde, antalTilskuer, runde, dommer);
                resultat.add(k1);
            }

        } catch (SQLException ex) {
            System.out.println("SQLEXception" + ex.getMessage());
        }

        return resultat;
    }
}
