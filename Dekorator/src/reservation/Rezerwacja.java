package reservation;

import java.util.List;

public abstract class Rezerwacja {
    protected int id;
    protected String miejsceWylotu;
    protected int idPasazera;
    protected String celPodrozy;
    protected double cena;
    protected String opis;

    public List<String> getDodatki() {
        return dodatki;
    }

    protected List<String> dodatki;

    public Rezerwacja() {

    }


    public void wyswietlBilet() {
        System.out.println("Opis: " + this.opis + "\n" + "MiejsceWylotu: " + this.miejsceWylotu + "\n" + "IdPasazera: " + this.idPasazera + "\n" + "Cel podrozy: " + this.celPodrozy + "\n");
    }

    public abstract String pobierzDodatki();

    public abstract double zwrocCeneBiletu();


}
