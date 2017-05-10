package punkt;

public class Punkt {

	int x;
	int y;
	
	void zwiekszX(){
		x++;
	}
	void zwiekszY(){
		y++;
	}
	void zmienX(int liczba){
	    x += liczba;
	}
	 
	void zmienY(int liczba){
	    y += liczba;
	}
	int zwrocX(){
		return x;
	}
	int zwrocY(){
		return y;
	}
	void wyswietl(){
        System.out.println("x: "+x+", y: "+y);
    }
}

