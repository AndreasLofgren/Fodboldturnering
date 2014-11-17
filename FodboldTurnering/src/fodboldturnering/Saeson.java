/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class Saeson {
    private String periode;
    private Division[] divisioner;
    private Kamprapport[] kamprapporter;
    private Turneringsrunde[] turneringsrunder;
    private SpillePlan spilleplan;

    public Saeson(String periode) {
        this.periode = periode;
        divisioner = new Division[3];
        kamprapporter = new Kamprapport[240];
        turneringsrunder = new Turneringsrunde[40];
        spilleplan = new SpillePlan(ArrayList<Klub> holdListe, ArrayList<Integer> rundeListe);
        
    } 

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Division[] getDivisioner() {
        return divisioner;
    }

    public void setDivisioner(Division[] divisioner) {
        this.divisioner = divisioner;
    }

    public Kamprapport[] getKamprapporter() {
        return kamprapporter;
    }

    public void setKamprapporter(Kamprapport[] kamprapporter) {
        this.kamprapporter = kamprapporter;
    }

    public Turneringsrunde[] getTurneringsrunder() {
        return turneringsrunder;
    }

    public void setTurneringsrunder(Turneringsrunde[] turneringsrunder) {
        this.turneringsrunder = turneringsrunder;
    }

    public SpillePlan getSpilleplan() {
        return spilleplan;
    }

    public void setSpilleplan(SpillePlan spilleplan) {
        this.spilleplan = spilleplan;
    }
    
    
}
