package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 * @author Roman Odehnal
 *
 * Třída Databaze slouží k ukládání dat o pojištěncích a poskytuje základní
 * operace s databází.
 */
public class Databaze {

    private final ArrayList<Pojisteny> pojistenci;

    /**
     * Konstruktor vytvoří novou instanci seznamu pro ukládání pojištěnců.
     */
    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Vytvoří novou instanci třídy Pojisteny s danými parametry a přidá ji do
     * seznamu pojištěnců.
     *
     * @param jmeno jméno pojištěnce
     * @param prijmeni příjmení pojištěnce
     * @param vek věk pojištěnce
     * @param telefon telefonní číslo pojištěnce
     */
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, int telefon) {
        pojistenci.add(new Pojisteny(jmeno, prijmeni, vek, telefon));
    }

    /**
     * Vrátí seznam všech pojištěnců v databázi.
     *
     * @return seznam všech pojištěnců v databázi
     */
    public ArrayList<Pojisteny> najdiVsechnyPojistene() {
        ArrayList<Pojisteny> vsichni = new ArrayList<>();
        vsichni.addAll(pojistenci);
        return vsichni;
    }

    /**
     * Vrátí seznam všech pojištěnců v databázi se shodným jménem a příjmením
     * jako zadané parametry.
     *
     * @param jmeno jméno pojištěnce
     * @param prijmeni příjmení pojištěnce
     * @return seznam všech pojištěnců v databázi se shodným jménem a příjmením
     * jako zadané parametry
     */
    public ArrayList<Pojisteny> najdiPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojisteny> nalezene = new ArrayList<>();
        // pomocí metody stream a filtru najdeme všechny pojištěnce s daným jménem a příjmením
        pojistenci.stream().filter(z -> ((z.getJmeno().equals(jmeno)) && ((z.getPrijmeni().equals(prijmeni))))).forEachOrdered(z -> {
            nalezene.add(z);
        });
        return nalezene;
    }

}
