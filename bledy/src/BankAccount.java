import java.util.Scanner;

class Error extends Exception {
    public Error(String message) {
        super(message);
    }
}
public class BankAccount {
    private double Konto;

    public double getKonto() {
        return Konto;
    }

    public void wplata(double kwota) {
        if (kwota <= 0) {
            throw new IllegalArgumentException("Musi być więcej niż 0");
        }
        Konto += kwota;
        System.out.println("Dodano: " + kwota + " PLN. Nowa ilość środków na koncie: " + Konto + " PLN.");
    }

    public void wyplata(double kwota) throws Error {
        if (kwota <= 0) {
            throw new IllegalArgumentException("Musi być więcej niz 0");
        }
        if (kwota > Konto) {
            throw new Error("Nie ma tyle na koncie: " + Konto + " PLN.");
        }
        Konto -= kwota;
        System.out.println("Wypłacono: " + kwota + " PLN. Nowa ilość środków na koncie: " + Konto + " PLN.");
    }
    public static void main(String[] args) {
        BankAccount konto = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        boolean dalej = true;

        while (dalej) {
            System.out.println("\nWybierz:");
            System.out.print("Wpłata - 1, Wypłata - 2, Sprawdź stan konta - 3, Wyjście - 4");
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    System.out.print("Podaj kwotę do wpłaty: ");
                    double kwotaWplaty = scanner.nextDouble();
                    try {
                        konto.wplata(kwotaWplaty);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Podaj kwotę do wypłaty: ");
                    double kwotaWyplaty = scanner.nextDouble();
                    try {
                        konto.wyplata(kwotaWyplaty);
                    } catch (Error | IllegalArgumentException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Stan konta: " + konto.getKonto() + " PLN.");
                    break;
                case 4:
                    dalej = false;
                    System.out.println("Wyłączono system bankowy.");
                    break;
                default:
                    System.out.println("Coś nie gra, spróbuj ponownie.");
            }
        }
    }
}