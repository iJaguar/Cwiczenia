package konstruktory_metody_dziedziczenie;

public class Konst_met_dziedziczenie {
	
	public static void main(String[] args){
		
		Nie_main opel = new Nie_main();
		
		opel.liczba_pasazerow = 5;
		opel.lkm = 7;
		opel.nazwa = "Opel";
		opel.pojemnosc_baku = 65;
		
		Nie_main wolksvagen = new Nie_main( "Wolksvagen", 4, 45 );
		
		Nie_main S_2 = new Nie_main(9.1, "Audi", 5, 59);
		
		opel.showCar();
		opel.range();
		System.out.println(" ");
		wolksvagen.showCar();
		wolksvagen.range();
		System.out.println(" ");
		S_2.showCar();
		S_2.range();
		System.out.println(" ");
		Nie_main s_3 = new Nie_main(18.7, "Jaguar E-type", 2, 60);
		s_3.showCar();
		s_3.range();
		
		
	}

}
