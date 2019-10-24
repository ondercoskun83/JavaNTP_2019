import java.util.Scanner;
//Kosinus teoremi
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		
		System.out.print("1.kenar:");
		double a=tara.nextDouble();
		System.out.print("2.kenar:");
		double b=tara.nextDouble();
		System.out.print("aci:");
		double aci=tara.nextDouble();	
		
		System.out.println("Sobnuç:"+ KosinusTeorem(a, b, aci));
		
		KosinusTeorem2(a, b, aci);

	}
	
	
	public static double KosinusTeorem(double a, double b, double aci) {
		double radyanaci=Math.toRadians(aci);
		double kareli=Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(radyanaci));
		return Math.sqrt(kareli);
	}
	
	public static void KosinusTeorem2(double a, double b, double aci) {
		System.out.println( Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(Math.toRadians(aci)))));
	}
	


}
