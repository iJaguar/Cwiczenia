package konstruktory_metody_dziedziczenie;

import static java.lang.String.*;

public class Car {
    double kilometers;
    String nazwa;
    int liczba_pasazerow;
    double pojemnosc_baku;

    Car() { //konstruktoir domyslny
    }

    Car(double kilometers, String name, int passengers, double capacity) {
        this.kilometers = kilometers;
        this.nazwa = name;
        this.liczba_pasazerow = passengers;
        this.pojemnosc_baku = capacity;
    }

    Car(String name, int passengers, double capacity) {
        this.kilometers = 10;
        this.nazwa = name;
        this.liczba_pasazerow = passengers;
        this.pojemnosc_baku = capacity;
    }//klasa,metody,konstruktory musza miec cialo

    void print() {
        System.out.println(format("%s pomiesci %d pasazerow, a pojemnosc jego baku wynosi: %d spala na 100 km %d",
                nazwa, liczba_pasazerow, pojemnosc_baku, kilometers));
    }

    void printRange() {
        System.out.println(format("%s na pelnym baku przejedzie: %d", nazwa, getRange()));
    }

    private double getRange() {
        return (pojemnosc_baku / kilometers) * 100;
    }
}
