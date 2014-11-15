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
public class HoldBegivenhed {

    private Klub hold;
    
    public HoldBegivenhed(Klub hold) {
        this.hold = hold;
    }
    
    public void registrerMål() {
        hold.setAntalMål(hold.getAntalMål() + 1);
    }
    
    public void registrerSejr() {
        hold.setSejre(hold.getSejre());
    }
    
    public void registrerPoint() {
        hold.setPointSum(hold.getPointSum());
    }
    
}
