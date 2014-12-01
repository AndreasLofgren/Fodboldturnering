/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodboldturnering;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Andreas
 */
public class SpillePlan {

    private ArrayList<Kamprapport> kampe;

    public SpillePlan(ArrayList<Klub> holdListe, ArrayList<Integer> rundeListe) {
        kampe = new ArrayList<>();
        int antalHold = holdListe.size();
        ArrayList<Kamprapport> frieKampe = new ArrayList<>();

        for (int i = 0; i < holdListe.size(); i++) {
            for (int j = i + 1; j < holdListe.size(); j++) {
                frieKampe.add(new Kamprapport(holdListe.get(i), holdListe.get(j)));
                frieKampe.add(new Kamprapport(holdListe.get(j), holdListe.get(i)));
            }
        }

        int rundenummer = 1;
        int count = 0;
        while (!frieKampe.isEmpty() && count < 1000) {
            int tr = rundenummer;
            rundenummer++;
            Collections.shuffle(frieKampe);
            ArrayList<Kamprapport> rundeKampe = new ArrayList<>();
            for (int i = frieKampe.size() - 1; i >= 0; i--) {
                System.out.println(i+" - "+frieKampe.size());
                if (!spillerAllerede(frieKampe.get(i), rundeKampe)) {
                    rundeKampe.add(frieKampe.remove(i));
                }
            }
            for (int i = 0; i < rundeKampe.size(); i++) {
                Kamprapport kamp = rundeKampe.get(i);
                kamp.setRunde(tr);
                kampe.add(kamp);
            }
        }

        for (int i = 0; i < kampe.size(); i++) {
            System.out.println(kampe.get(i));

        }

    }

    public boolean spillerAllerede(Kamprapport kamp, ArrayList<Kamprapport> rundeKampe) {
        boolean found = false;
        for (int i = 0; i < rundeKampe.size(); i++) {
            if (rundeKampe.get(i).getHjemmehold().equals(kamp.getHjemmehold())) {
                found = true;
            }
            if (rundeKampe.get(i).getHjemmehold().equals(kamp.getUdehold())) {
                found = true;
            }
            if (rundeKampe.get(i).getUdehold().equals(kamp.getHjemmehold())) {
                found = true;
            }
            if (rundeKampe.get(i).getUdehold().equals(kamp.getUdehold())) {
                found = true;
            }
        }
        return found;
    }
}
