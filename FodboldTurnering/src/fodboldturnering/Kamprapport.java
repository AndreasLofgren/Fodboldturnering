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
    private int målHjemme;
    private int målUde;
    private int selvmålHjemme;
    private int selvmålUde;
    private int advarselHjemme;
    private int advarselUde;
    private int udvisningHjemme;
    private int udvisningUde;
    private int antalTilskuer;
    private int runde;
    private Dommer dommer;

    public Kamprapport(Klub hjemmehold, Klub udehold) {
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
    }  
    
    public Kamprapport(String spilledag, String tidspunkt, String sted, Klub hjemmehold, Klub udehold, String[] startOpstillingHjemme, String[] startOpstillingUde, int målHjemme, int målUde, int selvmålHjemme, int selvmålUde, int advarselHjemme, int advarselUde, int udvisningHjemme, int udvisningUde, int antalTilskuer, int runde, Dommer dommer) {
        this.spilledag = spilledag;
        this.tidspunkt = tidspunkt;
        this.sted = sted;
        this.hjemmehold = hjemmehold;
        this.udehold = udehold;
        this.startOpstillingHjemme = startOpstillingHjemme;
        this.startOpstillingUde = startOpstillingUde;
        this.målHjemme = målHjemme;
        this.målUde = målUde;
        this.selvmålHjemme = selvmålHjemme;
        this.selvmålUde = selvmålUde;
        this.advarselHjemme = advarselHjemme;
        this.advarselUde = advarselUde;
        this.udvisningHjemme = udvisningHjemme;
        this.udvisningUde = udvisningUde;
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

    public int getMålHjemme() {
        return målHjemme;
    }

    public void setMålHjemme(int målHjemme) {
        this.målHjemme = målHjemme;
    }

    public int getMålUde() {
        return målUde;
    }

    public void setMålUde(int målUde) {
        this.målUde = målUde;
    }

    public int getSelvmålHjemme() {
        return selvmålHjemme;
    }

    public void setSelvmålHjemme(int selvmålHjemme) {
        this.selvmålHjemme = selvmålHjemme;
    }

    public int getSelvmålUde() {
        return selvmålUde;
    }

    public void setSelvmålUde(int selvmålUde) {
        this.selvmålUde = selvmålUde;
    }

    public int getAdvarselHjemme() {
        return advarselHjemme;
    }

    public void setAdvarselHjemme(int advarselHjemme) {
        this.advarselHjemme = advarselHjemme;
    }

    public int getAdvarselUde() {
        return advarselUde;
    }

    public void setAdvarselUde(int advarselUde) {
        this.advarselUde = advarselUde;
    }

    public int getUdvisningHjemme() {
        return udvisningHjemme;
    }

    public void setUdvisningHjemme(int udvisningHjemme) {
        this.udvisningHjemme = udvisningHjemme;
    }

    public int getUdvisningUde() {
        return udvisningUde;
    }

    public void setUdvisningUde(int udvisningUde) {
        this.udvisningUde = udvisningUde;
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
