package konstruktory_metody_dziedziczenie;

public class Application {

    public static void main(String[] args) {
        Car opel = new Car();

        opel.liczba_pasazerow = 5;
        opel.kilometers = 7;
        opel.nazwa = "Opel";
        opel.pojemnosc_baku = 65;

        Car wolksvagen = new Car("Wolksvagen", 4, 45);

        Car S_2 = new Car(9.1, "Audi", 5, 59);

        opel.print();
        opel.printRange();
        System.out.println(" ");
        wolksvagen.print();
        wolksvagen.printRange();
        System.out.println(" ");
        S_2.print();
        S_2.printRange();
        System.out.println(" ");
        Car s_3 = new Car(18.7, "Jaguar E-type", 2, 60);
        s_3.print();
        s_3.printRange();
    }
}
