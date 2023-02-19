/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

/**
 *
 * @author roman odehnal
 * 
 */
public class EvidencePojisteni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        DatabazePojistenych databazePojistenych = new DatabazePojistenych();
        String vyber = "";

        while (!vyber.equals("4")) {
            System.out.println("------------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného:");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            vyber = sc.nextLine();
            System.out.println();

            switch (vyber) {
                case "1":
                    databazePojistenych.vytvorPojisteneho();
                    break;
                case "2":
                    databazePojistenych.vypisVsechnyPojistene();
                    break;
                case "3":
                    databazePojistenych.vyhledejPojisteneho();
                    break;
                case "4":
                    System.out.println("Ukončení aplikace...");
                    break;
                default:
                    System.out.println("Chybná volba! Opakujte volbu...");
            }
        }
    }
}
