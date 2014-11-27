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
public class KampBegivenhed {

    private int målHjemme;
    private int målUde;
    private int selvmålHjemme;
    private int selvmålUde;
    private int advarslerHjemme;
    private int advarslerUde;
    private int udvisningHjemme;
    private int udvisningUde;

    public KampBegivenhed(int målHjemme, int målUde, int selvmålHjemme, int selvmålUde, int advarslerHjemme, int advarslerUde, int udvisningHjemme, int udvisningUde) {
        this.målHjemme = målHjemme;
        this.målUde = målUde;
        this.selvmålHjemme = selvmålHjemme;
        this.selvmålUde = selvmålUde;
        this.advarslerHjemme = advarslerHjemme;
        this.advarslerUde = advarslerUde;
        this.udvisningHjemme = udvisningHjemme;
        this.udvisningUde = udvisningUde;
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

    public int getAdvarslerHjemme() {
        return advarslerHjemme;
    }

    public void setAdvarslerHjemme(int advarslerHjemme) {
        this.advarslerHjemme = advarslerHjemme;
    }

    public int getAdvarslerUde() {
        return advarslerUde;
    }

    public void setAdvarslerUde(int advarslerUde) {
        this.advarslerUde = advarslerUde;
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
    
    
    
}
