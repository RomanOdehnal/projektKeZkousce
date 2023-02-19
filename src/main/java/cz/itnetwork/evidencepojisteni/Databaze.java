/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 *
 * @author roman odehnal
 */
public class Databaze {

    private final ArrayList<Pojisteny> pojistenci;

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, int telefon) {
        pojistenci.add(new Pojisteny(jmeno, prijmeni, vek, telefon));
    }

    public ArrayList<Pojisteny> najdiVsechnyPojistene() {
        ArrayList<Pojisteny> vsichni = new ArrayList<>();
        vsichni.addAll(pojistenci);
        return vsichni;
    }

    public ArrayList<Pojisteny> najdiPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojisteny> nalezene = new ArrayList<>();
        pojistenci.stream().filter(z -> ((z.getJmeno().equals(jmeno)) && ((z.getPrijmeni().equals(prijmeni))))).forEachOrdered(z -> {
            nalezene.add(z);
        });
        return nalezene;

    }

}
