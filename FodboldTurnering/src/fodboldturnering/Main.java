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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testTurneringsplan();
        
    }

    public static void testTurneringsplan() {
        ArrayList<Kamprapport> kampe = new ArrayList<>();
        Klub h1 = new Klub("Næstved");
        Klub h2 = new Klub("Slagelse");
        Klub h3 = new Klub("KGB");
        Klub h4 = new Klub("Ringsted");
        System.out.println(h1.getKlubNavn());

        ArrayList<Integer> tal = new ArrayList<>();
        ArrayList<Klub> hold = new ArrayList<>();
        hold.add(h1);
        hold.add(h2);
        int x = 1;
        tal.add(x);
        System.out.println(x);

        Kamprapport k1 = new Kamprapport(h1, h2);
        System.out.println("x");

        kampe.add(k1);
        System.out.println("y");

        Kamprapport k2 = new Kamprapport(h3, h4);
        //System.out.println(k1.getHjemmehold().getKlubNavn() + k1.getUdehold().getKlubNavn());

        SpillePlan plan = new SpillePlan(hold, tal);
        System.out.println("skriv noget");
        if (plan.isOneOfTheTeamsAlreadyInList(k2, kampe)) {
            System.out.println("Giver true");
        } else {
            System.out.println("Giver false");
        }
    }
}

