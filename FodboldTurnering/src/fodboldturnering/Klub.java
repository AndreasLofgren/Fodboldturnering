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
public class Klub {

    private String klubNavn;
    private String adresse;
    private int sejre;
    private int uafgjorte;
    private int tabte;
    private int pointSum;
    private int antalKampe;
    private int sæsonPlacering;
    private int antalMål;
    private String trænerNavn;
    private Division divisionsnummer;

    public Klub(String klubNavn, String adresse, int sejre, int uafgjorte, int tabte, int pointSum, int antalKampe, int sæsonPlacering, int antalMål, String trænerNavn, Division divisionsnummer) {
        this.klubNavn = klubNavn;
        this.adresse = adresse;
        this.sejre = sejre;
        this.uafgjorte = uafgjorte;
        this.tabte = tabte;
        this.pointSum = pointSum;
        this.antalKampe = antalKampe;
        this.sæsonPlacering = sæsonPlacering;
        this.antalMål = antalMål;
        this.trænerNavn = trænerNavn;
        this.divisionsnummer = divisionsnummer;
    }

    public Division getDivisionsnummer() {
        return divisionsnummer;
    }

    public void setDivisionsnummer(Division divisionsnummer) {
        this.divisionsnummer = divisionsnummer;
    }

    public String getKlubNavn() {
        return klubNavn;
    }

    public void setKlubNavn(String klubNavn) {
        this.klubNavn = klubNavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getSejre() {
        return sejre;
    }

    public void setSejre(int sejre) {
        this.sejre = sejre;
    }

    public int getUafgjorte() {
        return uafgjorte;
    }

    public void setUafgjorte(int uafgjorte) {
        this.uafgjorte = uafgjorte;
    }

    public int getTabte() {
        return tabte;
    }

    public void setTabte(int tabte) {
        this.tabte = tabte;
    }

    public int getPointSum() {
        return pointSum;
    }

    public void setPointSum(int pointSum) {
        this.pointSum = pointSum;
    }

    public int getAntalKampe() {
        return antalKampe;
    }

    public void setAntalKampe(int antalKampe) {
        this.antalKampe = antalKampe;
    }

    public int getSæsonPlacering() {
        return sæsonPlacering;
    }

    public void setSæsonPlacering(int sæsonPlacering) {
        this.sæsonPlacering = sæsonPlacering;
    }

    public int getAntalMål() {
        return antalMål;
    }

    public void setAntalMål(int antalMål) {
        this.antalMål = antalMål;
    }

    public String getTrænerNavn() {
        return trænerNavn;
    }

    public void setTrænerNavn(String trænerNavn) {
        this.trænerNavn = trænerNavn;
    }

    @Override
    public String toString() {
        return klubNavn;
    }

}
