package reservation;

import java.util.ArrayList;

public class RezerwacjaBiznesKlasy extends Rezerwacja {


    public RezerwacjaBiznesKlasy(int id, String miejsceWylotu, int idPasazera, String celPodrozy) {

        this.id = id;
        this.miejsceWylotu = miejsceWylotu;
        this.idPasazera = idPasazera;
        this.celPodrozy = celPodrozy;
        this.dodatki = new ArrayList<>();
        this.opis = "Bilet biznes klasy";
    }


    @Override
    public String pobierzDodatki() {
        return null;
    }

    @Override
    public double zwrocCeneBiletu() {
        return 350;
    }
}
