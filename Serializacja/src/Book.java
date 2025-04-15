import java.io.Serializable;
import java.util.UUID;

public class Book implements Serializable {
    private String tytul;
    private String autor;
    private int rok;
    private String id;

    public Book(String title, String author, int year) {
        this.tytul = title;
        this.autor = author;
        this.rok = year;
        this.id = UUID.randomUUID().toString();
    }

    public String toString() {
        return tytul + " | " + autor + " | " + rok + " | " + id;
    }
}
