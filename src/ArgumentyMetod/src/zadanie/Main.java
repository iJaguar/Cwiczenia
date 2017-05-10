package zadanie;

public class Main {
	public static void main(String[] args){
		Punkt pkt = new Punkt();
		
		pkt.wspX = 0;
		pkt.wspY = 0;
		
		pkt.zwiekszX();
		pkt.zwiekszY();
		pkt.wyswietlXY();
		
		pkt.zmienX(5);
		pkt.zmienY(7);
		pkt.wyswietlXY();
		
		int dajX = pkt.zwrocX();
		int dajY = pkt.zwrocY();
		pkt.wyswietlXY();
	}
	
	
}
