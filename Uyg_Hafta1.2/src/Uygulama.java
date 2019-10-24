import java.util.Scanner;
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("1.arac hızı:");
		double hiz1=tara.nextDouble();
		System.out.print("1.arac yon:");
		String yon1=tara.next();
		System.out.print("2.arac hızı:");
		double hiz2=tara.nextDouble();
		System.out.print("2.arac yon:");
		String yon2=tara.next();
		
		System.out.print("t (dakika)");
		double dakika=tara.nextDouble();		
		
		
		Hesapla(hiz1, hiz2,	dakika, yon1, yon2);
		
		
	}
	
	public static void Hesapla(double h1, double h2, double sure, String yon1, String yon2)
	{
		if(yon1.equals(yon2)) {
			if( h1>h2) {
				System.out.println("Sonuc:"+((h1-h2)*(sure/60)));
			}
			else {
				System.out.println("Sonuc:"+((h2-h1)*(sure/60)));
			}
		}
		else {
			System.out.println("Sonuc:"+((h1+h2)*(sure/60)));
		}
	}
	
}
