/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

/**
 *
 * @author roman odehnal
 */
public class Pojisteny {

    private final String jmeno;
    private final String prijmeni;
    private final int vek;
    private final int telefon;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefon() {
        return telefon;
    }
    

    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t\t" + vek + "\t" + telefon;
    }
}
