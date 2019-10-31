
public class Donguler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for (; i < 20; i+=5 ) {
			System.out.println("For döngüsü");
		}
		/*
		for (; ; ) {
			System.out.println("Sonsuz döngü");
		}
		*/
		int sayac1=0;
		while (sayac1<20) {
			System.out.println("While döngüsü");
			sayac1+=5;
		}
		
		int sayac2=0;
		do {
			System.out.println("Do-While döngüsü");
			sayac2+=5;
			if (sayac2==10) {
				break;
				//continue;
			}
			
		} while (sayac2<20);
		
		
		//Dizi, ArrayList, List
		String[] dersler= {"NTP", "Ağlar", "Mimari", "Etik", "VT"};
		//foreach
		for (String degiskenim : dersler) {
			System.out.println(degiskenim);
		}
		//For ile diziler
		for (int j = 0; j < dersler.length; j++) {
			System.out.println(dersler[j]);
		}
		
		
		
		
		
		
		
	}

}
