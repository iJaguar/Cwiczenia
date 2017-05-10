package konstruktory_metody_dziedziczenie;

public class Nie_main {
	
	double lkm;
	String nazwa;
	int liczba_pasazerow;
	double pojemnosc_baku;
	
	Nie_main()
	{ //konstruktoir domyslny 
	}
	
	Nie_main(double l, String n, int p, double b)
	{
		this.lkm = l;
		this.nazwa = n;
		this.liczba_pasazerow = p;
		this.pojemnosc_baku = b;
	}
	Nie_main(String n, int p, double b)
	{
		this.lkm = 10;
		this.nazwa = n;
		this.liczba_pasazerow = p;
		this.pojemnosc_baku = b;
	}//klasa,metody,konstruktory musza miec cialo
	void showCar(){
		System.out.println(nazwa + " pomieœci " + liczba_pasazerow + " pasa¿erów, pojemnoœæ jego baku wynosi: " 
							+ pojemnosc_baku + " spala na 100 km: " + lkm);
	}
	void range(){
		double a = (pojemnosc_baku / lkm ) * 100;
		System.out.println(nazwa + " na pelnym baku przejedzie: " + a);
	}

}
