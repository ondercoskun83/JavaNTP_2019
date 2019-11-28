//Klavyeden alinan x ve y degeriyle 
// f(x,y)=3x^2+4y^3-2yx^2+13 fonksiyonunun ciktisini donderin
import java.util.Scanner;
public class MatematikselFonk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("x:");
		int x=tara.nextInt();
		System.out.print("y:");
		int y=tara.nextInt();
		
		System.out.println("Fonksiyon sonucu:"+HesapFonk(x, y)); 
		}
	
	
	public static double HesapFonk(double x, double y) {		
		return 3*Math.pow(x, 2)+4*Math.pow(y, 3)-2*y*Math.pow(x, 2)+13;
	}

}


