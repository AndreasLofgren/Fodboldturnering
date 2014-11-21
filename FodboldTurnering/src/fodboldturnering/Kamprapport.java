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
    private Klub hjemmehold;
    private Klub udehold;
    private String[] startOpstilling;
    private int scoredeMål, selvmål, guleKort, rødeKort;
    private int antalTilskuer;
    private int runde;
    private Dommer dommer;

    public Kamprapport(Klub hjemmehold, Klub udehold) {
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
        dommer = new Dommer("Erling Hansen");
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
        return "Hjemmehold: " + hjemmehold.getKlubNavn() + "\n" + "Udehold: " + udehold.getKlubNavn() +"\n";
    }
    
    

}
