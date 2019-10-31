import java.util.Scanner;
public class Dongu {

	public static void main(String[] args) {
		/*
		//15 ile 90 arasindaki sayilarin ortalamasi
		int sayac=0;
		double sonuc=0;
		for (int i = 16; i < 90; i++) {
			sonuc+=i;
			sayac++;
		}		
		System.out.println("Ortalama:"+(sonuc/sayac));		
		*/

		Scanner tara=new Scanner(System.in);
		System.out.print("Birinci sayi:");
		int a=tara.nextInt();
		System.out.print("Ikinci sayi:");
		int b=tara.nextInt();
		
	
		
		Hesaplama obj=new Hesaplama();
		obj.HesaplaWhile(a, b);		
		System.out.println(obj.HesaplaFor(a, b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
