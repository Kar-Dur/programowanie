import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        setTitle("Logowanie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel Gora = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Gora.setBackground(new Color(173, 216, 230));
        JLabel tytul = new JLabel("Panel Logowania");
        Gora.add(tytul);
        add(Gora, BorderLayout.NORTH);

        JTextArea tekst = new JTextArea();
        add(tekst, BorderLayout.CENTER);

        JPanel Dol = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton Zaloguj = new JButton("Zaloguj");
        JButton Anuluj = new JButton("Anuluj");
        Dol.add(Zaloguj);
        Dol.add(Anuluj);
        add(Dol, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
    }

    static void main() {
        new Main();
    }
}
