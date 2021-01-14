import decorators.Koc;
import decorators.Poduszka;
import reservation.Rezerwacja;
import reservation.RezerwacjaBiznesKlasy;

public class TestowaKlasa {


    public static void main(String[] args) {
        Rezerwacja rezerwacja = new RezerwacjaBiznesKlasy(1,"WARSZAWA",2,"KRAKOW");
        rezerwacja = new Poduszka(rezerwacja);
        rezerwacja = new Koc(rezerwacja);
        System.out.println(  rezerwacja.pobierzDodatki());
        rezerwacja.wyswietlBilet();
        System.out.println(rezerwacja.pobierzDodatki());
        System.out.println("Cena biletu: " + rezerwacja.zwrocCeneBiletu());

    }
}
