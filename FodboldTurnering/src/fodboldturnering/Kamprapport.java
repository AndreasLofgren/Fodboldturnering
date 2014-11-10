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
    private int scoredeMål;
    private int antalTilskuer;
    private int turneringsrunde;
    private Dommer dommer;

    public Kamprapport(String hjemmehold, String udehold, int turneringsrunde) {
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
        this.turneringsrunde = turneringsrunde;
        spilledag = "";
        tidspunkt = "";
        sted = "";
        startOpstilling = new String[11];
        scoredeMål = 0;
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

    public int getAntalTilskuer() {
        return antalTilskuer;
    }

    public void setAntalTilskuer(int antalTilskuer) {
        this.antalTilskuer = antalTilskuer;
    }

    public int getTurneringsrunde() {
        return turneringsrunde;
    }

    public void setTurneringsrunde(int turneringsrunde) {
        this.turneringsrunde = turneringsrunde;
    }

    public Dommer getDommer() {
        return dommer;
    }

    public void setDommer(Dommer dommer) {
        this.dommer = dommer;
    }
    
    
}
