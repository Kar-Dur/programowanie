import java.util.*;

class Stosy {

    // TreeSet sortuje alfabetycznie
    private Set<String> uczestnicy = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    // HashMap szybkie przypisywanie numerów
    private Map<String, Integer> numery = new HashMap<>();

    private Scanner scanner = new Scanner(System.in);

    void dodaj() {
        System.out.print("Podaj imię uczestnika: ");
        String imie = scanner.nextLine().toLowerCase();
        if (uczestnicy.add(imie)) {
            System.out.println("Dodano: " + imie);
        } else {
            System.out.println("Jest już: " + imie);
        }
    }

    void usun() {
        System.out.print("Podaj imię do usunięcia: ");
        String imie = scanner.nextLine().toLowerCase();
        if (uczestnicy.remove(imie)) {
            numery.remove(imie);
            System.out.println("Usunięto: " + imie);
        } else {
            System.out.println("Brak: " + imie);
        }
    }

    void sprawdzObecnosc() {
        System.out.print("Podaj imię do sprawdzenia: ");
        String imie = scanner.nextLine().toLowerCase();
        System.out.println(imie + (uczestnicy.contains(imie) ? " jest na liście." : " nie ma na liście."));
    }

    void numer() {
        System.out.print("Podaj imię uczestnika: ");
        String imie = scanner.nextLine().toLowerCase();
        if (uczestnicy.contains(imie)) {
            System.out.print("Podaj numer startowy: ");
            int nr = scanner.nextInt();
            scanner.nextLine();
            numery.put(imie, nr);
            System.out.println(imie + " -> " + nr);
        } else {
            System.out.println("Nie ma " + imie);
        }
    }

    void lista() {
        System.out.println("Lista uczestników posortowana alfabetycznie, bez numerów:");
        uczestnicy.forEach(System.out::println);
        System.out.println("Lista uczestników z numerami");
        numery.forEach( (k, v) -> { System.out.println(k + " -> " + v); } );
    }

    void menu() {
        while (true) {
            System.out.println("\n1. Dodaj uczestnika");
            System.out.println("2. Usuń uczestnika");
            System.out.println("3. Sprawdź obecność");
            System.out.println("4. Przydziel numer startowy");
            System.out.println("5. Wyświetl listę");
            System.out.println("6. Wyjdź");
            System.out.print("Wybierz opcję: ");
            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1 -> dodaj();
                case 2 -> usun();
                case 3 -> sprawdzObecnosc();
                case 4 -> numer();
                case 5 -> lista();
                case 6 -> {
                    System.out.println("Zakończono program.");
                    return;
                }
                default -> System.out.println("Błąd, spróbuj jeszcze raz");
            }
        }
    }

    public static void main(String[] args) {
        new Stosy().menu();
    }
}
