package typyObiektowe;

public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.x = 5;
        punkt.y = 5;

        Test.zmien(punkt);

        System.out.println("Wsp�rz�dne to: " + punkt.x + " " + punkt.y);
    }
}

class Test {
    static void zmien(Punkt pkt) {
        pkt.x++;
        pkt.y++;
    }
}

class Punkt {
    int x;
    int y;
}