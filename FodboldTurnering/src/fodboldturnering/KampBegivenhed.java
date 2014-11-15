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

    private Kamprapport rapport;
    private String tidspunkt;
    
    public KampBegivenhed(String tidspunkt) {
        rapport = new Kamprapport(rapport.getHjemmehold(), rapport.getUdehold(), rapport.getRunde());
        this.tidspunkt = tidspunkt;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
    
    public void registrerMål() {
        rapport.setScoredeMål(rapport.getScoredeMål() + 1);
    }
    
    public void registrerSelvmål() {
        rapport.setSelvmål(rapport.getSelvmål() + 1);
    }
    
    public void registrerGultKort() {
        rapport.setGuleKort(rapport.getGuleKort());
    }
    
    public void registrerRødtKort() {
        rapport.setRødeKort(rapport.getRødeKort() + 1);
    }
    
}
