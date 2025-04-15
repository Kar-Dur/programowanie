import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> ksiazki = new ArrayList<>();

    public void addBook(Book book) {
        ksiazki.add(book);
    }

    public void Zapisz(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(ksiazki);
        } catch (IOException e) {
            System.out.println("blad zapisywania do pliku");
        }
    }

    public void Wczytaj(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            ksiazki = (List<Book>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("blad odczytywania z pliku");
        }
    }

    public void Wyswietl() {
        if (ksiazki.isEmpty()) {
            System.out.println("nie ma ksiazek");
            return;
        }
        ksiazki.forEach(System.out::println);
    }
}
