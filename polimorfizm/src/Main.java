import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UslugaLogowania uslugaLogowania = new UslugaLogowania();

        System.out.println("Wybierz sposób logowania:");
        System.out.println("1. Login i hasło");
        System.out.println("2. E-mail i hasło");
        System.out.println("3. Login i token");
        System.out.println("4. Numer telefonu i hasło");
        int wybor = scanner.nextInt();
        scanner.nextLine();

        switch (wybor) {
            case 1:
                System.out.print("Podaj login: ");
                String login = scanner.nextLine();
                System.out.print("Podaj hasło: ");
                String haslo = scanner.nextLine();
                uslugaLogowania.zaloguj(login, haslo);
                break;
            case 2:
                System.out.print("Podaj login: ");
                login = scanner.nextLine();
                System.out.print("Podaj e-mail: ");
                String email = scanner.nextLine();
                System.out.print("Podaj hasło: ");
                haslo = scanner.nextLine();
                uslugaLogowania.zaloguj(login, email, haslo);
                break;
            case 3:
                System.out.print("Podaj login: ");
                login = scanner.nextLine();
                System.out.print("Podaj token: ");
                int token = scanner.nextInt();
                uslugaLogowania.zaloguj(login, token);
                break;
            case 4:
                System.out.print("Podaj numer telefonu: ");
                long numerTelefonu = scanner.nextLong();
                scanner.nextLine();
                System.out.print("Podaj hasło: ");
                haslo = scanner.nextLine();
                uslugaLogowania.zaloguj(numerTelefonu, haslo);
                break;
            default:
                System.out.println("Nieprawidłowy wybór!");
        }

        scanner.close();

        Uzytkownik administrator = new Administrator();
        Uzytkownik programista = new Programista();
        Uzytkownik tester = new Tester();
        Uzytkownik menedzer = new Menedzer();

        System.out.println("Administrator: " + administrator.PoziomDostepu());
        System.out.println("Programista: " + programista.PoziomDostepu());
        System.out.println("Tester: " + tester.PoziomDostepu());
        System.out.println("Menedżer: " + menedzer.PoziomDostepu());
    }
}
