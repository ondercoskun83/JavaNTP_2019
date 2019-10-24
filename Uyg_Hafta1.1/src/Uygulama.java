import java.util.Scanner;
public class Uygulama {
//Ayni yone giden araclarin arasindaki mesafeyi bulduran prg.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("1.arac hızı:");
		double hiz1=tara.nextDouble();
		System.out.print("2.arac hızı:");
		double hiz2=tara.nextDouble();
		
		System.out.print("t (saat)");
		double saat=tara.nextDouble();	
		
		//void fonksiyonu cagirma
		Hesapla(hiz1, hiz2, saat);
		
		//return edilen fonksiyon cagirma
		double sonucc=Hesapla2(hiz1, hiz2, saat);
		System.out.println("Ikinci fonksiyon ile:"+sonucc);
		System.out.println("Ikinci fonksiyon ile:"+Hesapla2(hiz1, hiz2, saat));
		
		
	}
	
	public static void Hesapla(double h1, double h2, double sure) {
		if(h1>h2)
			System.out.println("Sonuc:"+((h1-h2)*sure)+"m");
		else
			System.out.println("Sonuc:"+((h2-h1)*sure)+"m");
	}
	
	public static double Hesapla2(double h1, double h2, double sure) {		
		if(h1>h2)
			return ((h1-h2)*sure);
		else
			return ((h2-h1)*sure);		
	}
	
	
	
	
	
	
	
	

}
