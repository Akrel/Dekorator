package decorators;


import reservation.Rezerwacja;

import java.util.ArrayList;
import java.util.Collections;

public class Koc extends DodatkoweUslugiDekorator {
    private final Rezerwacja rezerwacja;

    public Koc(Rezerwacja rezerwacja) {
        this.rezerwacja = rezerwacja;
        dodatki = this.rezerwacja.getDodatki();
        dodatki.add("KOC");
    }

    @Override
    public String pobierzDodatki() {

        return String.join(",", dodatki);

    }


    @Override
    public void wyswietlBilet() {
        rezerwacja.wyswietlBilet();
    }


    @Override
    public double zwrocCeneBiletu() {
        return rezerwacja.zwrocCeneBiletu() + 30.0;
    }
}
