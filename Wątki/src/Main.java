import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Car extends Thread {
    private final String nazwa;
    private int dystans = 0;
    private static boolean koniec = false;
    private static final Object lock = new Object();
    private final Random random = new Random();

    public Car(String nazwa) {
        super(nazwa);
        this.nazwa = nazwa;
    }

    @Override
    public void run() {
        while (!koniec) {
            try {
                Thread.sleep(1000);
                synchronized (lock) {
                    if (!koniec) {
                        dystans += random.nextInt(10) + 1;
                        System.out.println(nazwa + " przejechał ---> [" + dystans + "m]");
                        if (dystans >= 100) {
                            koniec = true;
                            System.out.println("Wygrał: " + nazwa);
                        }
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile samochodów bierze udział w wyścigu: ");
        int ile = scanner.nextInt();
        scanner.close();

        List<Car> auta = new ArrayList<>();
        for (int i = 1; i <= ile; i++) {
            Car car = new Car("Samochód " + i);
            auta.add(car);
            car.start();
        }

        long Start = System.currentTimeMillis();
        for (Car car : auta) {
            try {
                car.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Czas trwania wyścigu: " + (System.currentTimeMillis() - Start) / 1000  + " sekund");
    }
}