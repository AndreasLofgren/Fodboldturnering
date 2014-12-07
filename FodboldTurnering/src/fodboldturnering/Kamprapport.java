/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class Kamprapport {

    private String spilledag;
    private String tidspunkt;
    private String sted;
    private Klub hjemmehold;
    private Klub udehold;
    private ArrayList<SpillerProfil> startOpstillingHjemme;
    private ArrayList<SpillerProfil> startOpstillingUde;
    private int antalTilskuer;
    private int runde;
    private Dommer dommer;

    public Kamprapport(Klub hjemmehold, Klub udehold) {
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
    }

    public Kamprapport(String spilledag, String tidspunkt, String sted, Klub hjemmehold, Klub udehold, ArrayList<SpillerProfil> startOpstillingHjemme, ArrayList<SpillerProfil> startOpstillingUde, int antalTilskuer, int runde, Dommer dommer) {
        this.spilledag = spilledag;
        this.tidspunkt = tidspunkt;
        this.sted = sted;
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
        this.startOpstillingHjemme = startOpstillingHjemme;
        this.startOpstillingUde = startOpstillingUde;
        this.antalTilskuer = antalTilskuer;
        this.runde = runde;
        this.dommer = dommer;
    }

    public String getSpilledag() {
        return spilledag;
    }

    public void setSpilledag(String spilledag) {
        this.spilledag = spilledag;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public Klub getHjemmehold() {
        return hjemmehold;
    }

    public void setHjemmehold(Klub hjemmehold) {
        this.hjemmehold = hjemmehold;
    }

    public Klub getUdehold() {
        return udehold;
    }

    public void setUdehold(Klub udehold) {
        this.udehold = udehold;
    }

    public ArrayList<SpillerProfil> getStartOpstillingHjemme() {
        return startOpstillingHjemme;
    }

    public void setStartOpstillingHjemme(ArrayList<SpillerProfil> startOpstillingHjemme) {
        this.startOpstillingHjemme = startOpstillingHjemme;
    }

    public ArrayList<SpillerProfil> getStartOpstillingUde() {
        return startOpstillingUde;
    }

    public void setStartOpstillingUde(ArrayList<SpillerProfil> startOpstillingUde) {
        this.startOpstillingUde = startOpstillingUde;
    }

    public int getAntalTilskuer() {
        return antalTilskuer;
    }

    public void setAntalTilskuer(int antalTilskuer) {
        this.antalTilskuer = antalTilskuer;
    }

    public int getRunde() {
        return runde;
    }

    public void setRunde(int runde) {
        this.runde = runde;
    }

    public Dommer getDommer() {
        return dommer;
    }

    public void setDommer(Dommer dommer) {
        this.dommer = dommer;
    }

    @Override
    public String toString() {
        return hjemmehold.getKlubNavn() + " vs " + udehold.getKlubNavn() + "\n";
    }
}
