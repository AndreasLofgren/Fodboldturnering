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
    private String navn;
    private int alder;
    private int antalMål, antalKampe, antalAdvarsler, antalUdvisninger;
    private int højesteMålScore;
    private int bedømmelse;
    private int ranglistePoint;

    public SpillerProfil(String navn) {
        this.navn = navn;
        alder = 0;
        antalMål = 0;
        antalKampe = 0;
        antalAdvarsler = 0;
        antalUdvisninger = 0;
        højesteMålScore = 0;
        bedømmelse = 0;
        ranglistePoint = 0;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
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

    public int getHøjesteMålScore() {
        return højesteMålScore;
    }

    public void setHøjesteMålScore(int højesteMålScore) {
        this.højesteMålScore = højesteMålScore;
    }

    public int getBedømmelse() {
        return bedømmelse;
    }

    public void setBedømmelse(int bedømmelse) {
        this.bedømmelse = bedømmelse;
    }

    public int getRanglistePoint() {
        return ranglistePoint;
    }

    public void setRanglistePoint(int ranglistePoint) {
        this.ranglistePoint = ranglistePoint;
    }
    
    
}
