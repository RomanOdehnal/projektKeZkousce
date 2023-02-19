/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roman odehnal
 */
public class DatabazePojistenych {

    private final Databaze databaze;

    private final Scanner sc;

    public DatabazePojistenych() {
        this.sc = new Scanner(System.in, "Windows-1250");
        databaze = new Databaze();
    }

    public void vytvorPojisteneho() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmenoZadani = sc.nextLine();
        String jmeno = jmenoZadani.trim().toLowerCase().substring(0, 1).toUpperCase() + jmenoZadani.substring(1);
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeniZadani = sc.nextLine();
        String prijmeni = prijmeniZadani.trim().toLowerCase().substring(0, 1).toUpperCase() + prijmeniZadani.substring(1);
        System.out.println("Zadejte telefonní číslo:");
        int telefon = Integer.parseInt(sc.nextLine().trim().replace(" ", ""));
        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(sc.nextLine().trim());
        databaze.vytvorPojisteneho(jmeno, prijmeni, vek, telefon);
        System.out.println("\nData byla uložena. \nPokračujte libovolnou klávesou...\n");

    }

    public void vypisVsechnyPojistene() {
        ArrayList<Pojisteny> zaznamy = databaze.najdiVsechnyPojistene();
        if (!zaznamy.isEmpty()) {
            for (Pojisteny z : zaznamy) {
                System.out.println(z);
            }
            System.out.println();
        } else {
            System.out.println("\nDatabáze neobsahuje žádné pojištěnce. \nPokračujte libovolnou klávesou...\n");

        }
    }

    public void vyhledejPojisteneho() {
        System.out.println("Zadejte jméno pojíštěného:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine().trim();
        System.out.println();
        ArrayList<Pojisteny> zaznamy = databaze.najdiPojisteneho(jmeno, prijmeni);
        if (!zaznamy.isEmpty()) {
            for (Pojisteny z : zaznamy) {
                System.out.println(z + "\n");
            }
        } else {

            System.out.println("\nHledaný pojištěnec nebyl nalezen. \nPokračujte libovolnou klávesou...\n");
        }
    }

}
