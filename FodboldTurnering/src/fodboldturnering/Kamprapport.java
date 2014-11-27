/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

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
    private String[] startOpstillingHjemme;
    private String[] startOpstillingUde;
    private int scoredeMålHjemme;
    private int scoredeMålUde;
    private int selvmål, guleKort, rødeKort;
    private int antalTilskuer;
    private int runde;
    private Dommer dommer;

    public Kamprapport(String spilledag, String tidspunkt, String sted, Klub hjemmehold, Klub udehold, String[] startOpstillingHjemme, String[] startOpstillingUde, int scoredeMålHjemme, int scoredeMålUde, int selvmål, int guleKort, int rødeKort, int antalTilskuer, int runde, Dommer dommer) {
        this.spilledag = spilledag;
        this.tidspunkt = tidspunkt;
        this.sted = sted;
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
        this.startOpstillingHjemme = startOpstillingHjemme;
        this.startOpstillingUde = startOpstillingUde;
        this.scoredeMålHjemme = scoredeMålHjemme;
        this.scoredeMålUde = scoredeMålUde;
        this.selvmål = selvmål;
        this.guleKort = guleKort;
        this.rødeKort = rødeKort;
        this.antalTilskuer = antalTilskuer;
        this.runde = runde;
        this.dommer = dommer;
    }

    public int getScoredeMålHjemme() {
        return scoredeMålHjemme;
    }

    public void setScoredeMålHjemme(int scoredeMålHjemme) {
        this.scoredeMålHjemme = scoredeMålHjemme;
    }

    public int getScoredeMålUde() {
        return scoredeMålUde;
    }

    public void setScoredeMålUde(int scoredeMålUde) {
        this.scoredeMålUde = scoredeMålUde;
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

    public String[] getStartOpstillingHjemme() {
        return startOpstillingHjemme;
    }

    public void setStartOpstillingHjemme(String[] startOpstillingHjemme) {
        this.startOpstillingHjemme = startOpstillingHjemme;
    }

    public String[] getStartOpstillingUde() {
        return startOpstillingUde;
    }

    public void setStartOpstillingUde(String[] startOpstillingUde) {
        this.startOpstillingUde = startOpstillingUde;
    }

    public int getSelvmål() {
        return selvmål;
    }

    public void setSelvmål(int selvmål) {
        this.selvmål = selvmål;
    }

    public int getGuleKort() {
        return guleKort;
    }

    public void setGuleKort(int guleKort) {
        this.guleKort = guleKort;
    }

    public int getRødeKort() {
        return rødeKort;
    }

    public void setRødeKort(int rødeKort) {
        this.rødeKort = rødeKort;
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
        return "Hjemmehold: " + hjemmehold.getKlubNavn() + "\n" + "Udehold: " + udehold.getKlubNavn() + "\n";
    }

}
