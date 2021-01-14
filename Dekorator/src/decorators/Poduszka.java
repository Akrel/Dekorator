package decorators;

import reservation.Rezerwacja;

import java.util.ArrayList;
import java.util.Collections;

public class Poduszka extends DodatkoweUslugiDekorator {
    private final Rezerwacja rezerwacja;

    public Poduszka(Rezerwacja rezerwacja) {
        super();
        this.rezerwacja = rezerwacja;
        dodatki = this.rezerwacja.getDodatki();
        dodatki.add("PODUSZKA");
    }

    @Override
    public String pobierzDodatki() {

        return String.join(",", this.dodatki);

    }

    @Override
    public void wyswietlBilet() {
        rezerwacja.wyswietlBilet();
    }


    @Override
    public double zwrocCeneBiletu() {
        return rezerwacja.zwrocCeneBiletu() + 50.0;
    }
}
