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
public class SpillerProfil {

    private String fnavn;
    private String enavn;
    private int alder;
    private int antalMål, antalKampe, antalAdvarsler, antalUdvisninger, antalSelvmål;
    private int maksMål;
    private int bedømmelse;
    private int samletPoint;
    private String cpr;

    public SpillerProfil(String fnavn, String enavn, int alder, int antalMål, int antalKampe, int antalAdvarsler, int antalUdvisninger, int antalSelvmål, int maksMål, int bedømmelse, int samletPoint, String cpr) {
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.alder = alder;
        this.antalMål = antalMål;
        this.antalKampe = antalKampe;
        this.antalAdvarsler = antalAdvarsler;
        this.antalUdvisninger = antalUdvisninger;
        this.antalSelvmål = antalSelvmål;
        this.maksMål = maksMål;
        this.bedømmelse = bedømmelse;
        this.samletPoint = samletPoint;
        this.cpr = cpr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getAntalMål() {
        return antalMål;
    }

    public void setAntalMål(int antalMål) {
        this.antalMål = antalMål;
    }

    public int getAntalKampe() {
        return antalKampe;
    }

    public void setAntalKampe(int antalKampe) {
        this.antalKampe = antalKampe;
    }

    public int getAntalSelvmål() {
        return antalSelvmål;
    }

    public void setAntalSelvmål(int antalSelvmål) {
        this.antalSelvmål = antalSelvmål;
    }

    public int getAntalAdvarsler() {
        return antalAdvarsler;
    }

    public void setAntalAdvarsler(int antalAdvarsler) {
        this.antalAdvarsler = antalAdvarsler;
    }

    public int getAntalUdvisninger() {
        return antalUdvisninger;
    }

    public void setAntalUdvisninger(int antalUdvisninger) {
        this.antalUdvisninger = antalUdvisninger;
    }

    public int getMaksMål() {
        return maksMål;
    }

    public void setMaksMål(int maksMål) {
        this.maksMål = maksMål;
    }

    public int getBedømmelse() {
        return bedømmelse;
    }

    public void setBedømmelse(int bedømmelse) {
        this.bedømmelse = bedømmelse;
    }

    public int getSamletPoint() {
        return samletPoint;
    }

    public void setSamletPoint(int samletPoint) {
        this.samletPoint = samletPoint;
    }

}
