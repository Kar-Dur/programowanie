public class Main {
    public static void main(String[] args) {
        KomponentUI przycisk = new Przycisk("przycisk");
        KomponentUI tekst = new Tekst("tekst");

        wyswietlKomponent(przycisk);
        wyswietlKomponent(tekst);
    }
    public static void wyswietlKomponent(KomponentUI komponent){
        komponent.render();
    };
}