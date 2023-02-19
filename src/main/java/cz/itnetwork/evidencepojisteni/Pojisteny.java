package cz.itnetwork.evidencepojisteni;

/**
 * @author Roman Odehnal
 *
 * Třída reprezentující pojištěného.
 */
public class Pojisteny {

    private final String jmeno; // jméno pojištěného
    private final String prijmeni; // příjmení pojištěného
    private final int vek; // věk pojištěného
    private final int telefon; // telefonní číslo pojištěného

    /**
     * Konstruktor pro vytvoření instance pojistného.
     *
     * @param jmeno jméno pojištěného
     * @param prijmeni příjmení pojištěného
     * @param vek věk pojištěného
     * @param telefon telefonní číslo pojištěného
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * Vrací jméno pojištěného.
     *
     * @return jméno pojištěného
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vrací příjmení pojištěného.
     *
     * @return příjmení pojištěného
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrací věk pojištěného.
     *
     * @return věk pojištěného
     */
    public int getVek() {
        return vek;
    }

    /**
     * Vrací telefonní číslo pojištěného.
     *
     * @return telefonní číslo pojištěného
     */
    public int getTelefon() {
        return telefon;
    }

    /**
     * Vrací řetězec reprezentující instanci pojištěného, obsahující jméno,
     * příjmení, věk a telefonní číslo, oddělené tabulátorem.
     *
     * @return řetězec reprezentující instanci pojištěného
     */
    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t\t" + vek + "\t" + telefon;
    }
}
