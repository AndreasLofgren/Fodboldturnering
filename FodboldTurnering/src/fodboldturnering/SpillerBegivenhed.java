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
public class SpillerBegivenhed {

    private SpillerProfil spiller;
    private String tidspunkt;

    public SpillerBegivenhed(SpillerProfil spiller, String tidspunkt) {
        this.spiller = spiller;
        this.tidspunkt = tidspunkt;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public void registrerMål() {
        spiller.setAntalMål(spiller.getAntalMål() + 1);
    }

    public void registrerSelvmål() {
        spiller.setAntalSelvmål(spiller.getAntalSelvmål() + 1);
    }

    public void registrerGultKort() {
        spiller.setAntalAdvarsler(spiller.getAntalAdvarsler() + 1);
    }

    public void registrerRødtKort() {
        spiller.setAntalUdvisninger(spiller.getAntalUdvisninger() + 1);
    }
    
//    public void registrerBedømmelse() {
//        spiller.setBedømmelse(spiller.getBedømmelse());
//    }
    
//    public void opdaterSamletPoint() {
//        spiller.setSamletPoint(spiller.getSamletPoint() + spiller.getBedømmelse());
//    }
    
    

}
