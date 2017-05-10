package zadanie;

public class Punkt {
	
	int wspX;
	int wspY;
	
	public void zwiekszX(){
		wspX++;
	}
	public void zwiekszY(){
		wspY++;
	}
	public void zmienX(int liczba){
		wspX += liczba;
	}//albo taki zapis
	public void zmienY(int liczba){
		wspY = wspY + liczba;
	}	
	int zwrocX(){
		return wspX;
	}
	int zwrocY(){
		return wspY;
	}
	void wyswietlXY(){
		System.out.println("Wartoœci wspolrzednych to: " + wspX +" "+ wspY);
	}
}
