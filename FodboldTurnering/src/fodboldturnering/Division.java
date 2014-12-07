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
public class Division {

    private int divisionsnummer;
    private Klub[] klubber;

    public Division(int divisionsnummer) {
        this.divisionsnummer = divisionsnummer;
        klubber = new Klub[16];
    }

    public int getDivisionsnummer() {
        return divisionsnummer;
    }

    public void setDivisionsnummer(int divisionsnummer) {
        this.divisionsnummer = divisionsnummer;
    }

    public Klub[] getKlubber() {
        return klubber;
    }

    public void setKlubber(Klub[] klubber) {
        this.klubber = klubber;
    }

}
