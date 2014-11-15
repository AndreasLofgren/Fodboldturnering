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

    private String spilledag, tidspunkt;
    private String sted;
    private String hjemmehold, udehold;
    private String[] startOpstilling;
    private int scoredeMål, selvmål, guleKort, rødeKort;
    private int antalTilskuer;
    private Turneringsrunde runde;
    private Dommer dommer;

    public Kamprapport(String hjemmehold, String udehold, Turneringsrunde runde) {
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
        this.runde = runde;
        spilledag = "";
        tidspunkt = "";
        sted = "";
        startOpstilling = new String[11];
        scoredeMål = 0;
        selvmål = 0;
        guleKort = 0;
        rødeKort = 0;
        antalTilskuer = 0;
        dommer = new Dommer(dommer.getNavn());
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

    public String getHjemmehold() {
        return hjemmehold;
    }

    public void setHjemmehold(String hjemmehold) {
        this.hjemmehold = hjemmehold;
    }

    public String getUdehold() {
        return udehold;
    }

    public void setUdehold(String udehold) {
        this.udehold = udehold;
    }

    public String[] getStartOpstilling() {
        return startOpstilling;
    }

    public void setStartOpstilling(String[] startOpstilling) {
        this.startOpstilling = startOpstilling;
    }

    public int getScoredeMål() {
        return scoredeMål;
    }

    public void setScoredeMål(int scoredeMål) {
        this.scoredeMål = scoredeMål;
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

    public Turneringsrunde getRunde() {
        return runde;
    }

    public void setRunde(Turneringsrunde runde) {
        this.runde = runde;
    }

    public Dommer getDommer() {
        return dommer;
    }

    public void setDommer(Dommer dommer) {
        this.dommer = dommer;
    }

}
