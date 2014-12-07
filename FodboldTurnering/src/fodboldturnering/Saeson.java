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
public class Saeson {

    private String periode;
    private Division[] divisioner;
    private Kamprapport[] kamprapporter;
    private int[] runder;
    private SpillePlan spilleplan;

    public Saeson(String periode) {
        this.periode = periode;
        divisioner = new Division[3];
        kamprapporter = new Kamprapport[240];
        runder = new int[40];

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

    public int[] getTurneringsrunder() {
        return runder;
    }

    public void setTurneringsrunder(int[] turneringsrunder) {
        this.runder = turneringsrunder;
    }

    public SpillePlan getSpilleplan() {
        return spilleplan;
    }

    public void setSpilleplan(SpillePlan spilleplan) {
        this.spilleplan = spilleplan;
    }
}
