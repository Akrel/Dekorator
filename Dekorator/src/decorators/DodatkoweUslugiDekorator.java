package decorators;

import reservation.Rezerwacja;

import java.util.List;

public abstract class DodatkoweUslugiDekorator extends Rezerwacja {
    protected List<String> dodatkiWypoczynkowe;




    public abstract String pobierzDodatki();
}
