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
public class Turneringsstilling {

    private Klub[] holdliste;
    private Klub hold;
    private Division nummer;

    public Turneringsstilling() {
        holdliste = new Klub[16];
        nummer = new Division(nummer.getDivisionsnummer());

        for (int i = 0; i < 10; i++) {
            holdliste[i] = new Klub();
        }
    }

    public void turneringsstillingPoint() {
        for (int i = 0; i < holdliste.length; i++) {
            if (holdliste[i].getPointSum() < holdliste[i + 1].getPointSum()) {
                Klub tmpHold = holdliste[i];
                holdliste[i] = holdliste[i + 1];
                holdliste[i + 1] = tmpHold;
            }
        }
    }
    
}
