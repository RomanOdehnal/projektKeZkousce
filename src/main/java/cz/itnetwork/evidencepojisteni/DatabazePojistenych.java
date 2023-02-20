package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Roman Odehnal
 *
 * Třída reprezentující databázi pojištěných.
 */
public class DatabazePojistenych {

    private final Databaze databaze;

    private final Scanner sc;

    /**
     * Konstruktor vytvářející novou instanci třídy DatabazePojistenych a
     * inicializující scanner pro vstup ze standardního vstupu a objekt
     * databáze.
     */
    public DatabazePojistenych() {
        this.sc = new Scanner(System.in, "Windows-1250");
        databaze = new Databaze();
    }

    // Metoda pro vytvoření nového záznamu o pojištěném v databázi.
    public void vytvorPojisteneho() {
        // vytiskne požadavek pro uživatele, aby zadal jméno pojištěného
        System.out.println("Zadejte jméno pojištěného:");
        String jmenoZadani = sc.nextLine().toLowerCase(); // načtení vstupu od uživatele a převede vše na malá písmena
        String jmeno = jmenoZadani.trim().substring(0, 1).toUpperCase() + jmenoZadani.substring(1); // Převod prvního písmena na velké a zbytku na malá písmena
        // vytiskne požadavek pro uživatele, aby zadal příjmení pojištěného
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeniZadani = sc.nextLine().toLowerCase(); // načtení vstupu od uživatele a převede vše na malá písmena
        String prijmeni = prijmeniZadani.trim().substring(0, 1).toUpperCase() + prijmeniZadani.substring(1); // Převod prvního písmena na velké a zbytku na malá písmena
        // zadání telefonního čísla
        System.out.println("Zadejte telefonní číslo:");
        int telefon = Integer.parseInt(sc.nextLine().trim().replace(" ", "")); // načtení vstupu od uživatele, odebrání mezery a převod na číslo
        // zadání věku
        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(sc.nextLine().trim()); // načtení vstupu od uživatele a převod na číslo
        // vytvoření nového záznamu v databázi
        databaze.vytvorPojisteneho(jmeno, prijmeni, vek, telefon); // Přidání nového záznamu do databáze
        // potvrzení uložení dat
        System.out.println("\nData byla uložena. \nPokračujte libovolnou klávesou...\n"); // Výpis potvrzení a čekání na jakoukoli klávesu od uživatele
    }

    // Metoda pro výpis všech pojištěnců v databázi.
    public void vypisVsechnyPojistene() {
        ArrayList<Pojisteny> zaznamy = databaze.najdiVsechnyPojistene(); // získání všech záznamů o pojištěncích z databáze
        if (!zaznamy.isEmpty()) { // pokud databáze obsahuje záznamy
            for (Pojisteny z : zaznamy) { // pro každý záznam v databázi
                System.out.println(z); // výpis záznamu na standardní výstup
            }
            System.out.println(); // prázdný řádek pro oddělení výpisu
        } else {
            // pokud databáze neobsahuje žádné záznamy o pojištěncích
            System.out.println("\nDatabáze neobsahuje žádné pojištěnce. \nPokračujte libovolnou klávesou...\n"); // Výpis chybové hlášky a čekání na jakoukoli klávesu od uživatele
        }
    }

    //Metoda pro vyhledání záznamu o pojištěném.
    public void vyhledejPojisteneho() {
        // vytiskne požadavek pro uživatele, aby zadal jméno hledaného pojištěného
        System.out.println("Zadejte jméno pojíštěného:");
        // načte zadané jméno jako řetězec a převede ho na malá písmena pro jednodušší porovnání
        String jmenoVyhledani = sc.nextLine().toLowerCase();
        // převod prvního písmena na velké a zbytku na malá písmena
        String jmeno = jmenoVyhledani.trim().substring(0, 1).toUpperCase() + jmenoVyhledani.substring(1);

        // vytiskne požadavek pro uživatele, aby zadal příjmení hledaného pojištěného
        System.out.println("Zadejte příjmení pojištěného:");
        // načte zadané příjmení jako řetězec a převede ho na malá písmena pro jednodušší porovnání
        String prijmeniVyhledani = sc.nextLine().toLowerCase();
        // převod prvního písmena na velké a zbytku na malá písmena
        String prijmeni = prijmeniVyhledani.trim().substring(0, 1).toUpperCase() + prijmeniVyhledani.substring(1);

        // prázdný řádek pro oddělení výpisu
        System.out.println();
        // vyhledá pojištěného v databázi podle zadaného jména a příjmení
        ArrayList<Pojisteny> zaznamy = databaze.najdiPojisteneho(jmeno, prijmeni);

        // pokud byl nalezen alespoň jeden záznam pro hledané jméno a příjmení
        if (!zaznamy.isEmpty()) {
            // vypíše všechny nalezené záznamy
            for (Pojisteny z : zaznamy) {
                System.out.println(z + "\n");
            }
        } else {
            // pokud nebyl nalezen žádný záznam pro hledané jméno a příjmení, vytiskne se hláška
            System.out.println("\nHledaný pojištěnec nebyl nalezen. \nPokračujte libovolnou klávesou...\n");
        }
    }
}
