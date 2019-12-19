//Dizi islemleri
import java.util.Arrays;
import java.util.Collections;

public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi1=new int[10];
		int[] dizi2= {12, 15, 8, 9, 45, 0};
		int[] dizi3;
		
		dizi3=new int[10];
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println("dizinin "+(i)+". indisi:"+dizi2[i]);
		}
		
		int elemansayisi=dizi2.length;
		
		//int sayac=0;
		for(int sayi:dizi2) {
			System.out.println(sayi);
			//sayac++;
		}
		
		//int[] dizi2= {12, 15, 8, 9, 45};
		System.out.println(Arrays.binarySearch(dizi2, 12));
		//Yorumlayın
		System.out.println("--------------------------------");
		System.arraycopy(dizi2, 0, dizi1, 2, 3);
		//arraycopy(kopyalanacakdizi, hangiindistenbesalayacak, hangidiziyekopyalanacak, 
		// kacınncı indisten baslayarak kopyalanacak, kac eleman kopyalacak)
		for(int sayi:dizi1) {
			System.out.println(sayi);
		}
		System.out.println("--------------------------------");
		//Arrays.sort(dizi2);
		Arrays.sort(dizi2, 2,6);
		for(int sayi:dizi2) {
			System.out.println(sayi);
		}
		
		//Arrays.fill(dizi3, 100);
		//dizi3 e tüm elemanlarına 100 atar
		Arrays.fill(dizi3, 2,4,100);
		//dizi3e 2.indisten baslar 4.indise varana kadar 100 atar
		System.out.println("--------------------------------");		
		for(int sayi:dizi3) {
			System.out.println(sayi);
		}
		
		//İki dizini aynı olup olmadıgıma bakar. Bool deger donderir
		//Esit ise true, degilse false
		System.out.println(Arrays.equals(dizi2, dizi3));
		
		//Cok boyutlu dizi olusturma islemleri
		int[][] dizi4=new int[5][5];
		int[][][] dizi5=new int[5][5][10];
		dizi4[1][5]=45;
		//Baslangic degeri vererek tensor ve matris tanimlama
		int[][] dizi6= {{1,2}, {15,36}, {21,-5}};
		int[][][] dizi7={{{1,2}, {15,36}}};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
