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
public class Dommer {
    private String navn;
    private int bedømmelse;

    public Dommer(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getBedømmelse() {
        return bedømmelse;
    }

    public void setBedømmelse(int bedømmelse) {
        this.bedømmelse = bedømmelse;
    }
    
    
}
