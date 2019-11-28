import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("x:");
		int x=tara.nextInt();
		System.out.print("y:");
		int y=tara.nextInt();
		
		System.out.println("Sonuç:"+Hesapla(x, y));
		
	}
	
	
	public static double Hesapla(int x, int y) {
		double sonuc=3*Math.pow(x, 2)+4*Math.pow(x, 3)*Math.pow(y, 2)-5*y+17;
		return sonuc;
	}

}
