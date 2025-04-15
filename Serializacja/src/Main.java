public class Main {
    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();

        lib.addBook(new Book("tytul1", "autor1", 2001));
        lib.addBook(new Book("tytul2", "autor2", 1999));

        lib.Zapisz("books.dat");

        LibraryManager newLib = new LibraryManager();
        newLib.Wczytaj("books.dat");
        newLib.Wyswietl();
    }
}
