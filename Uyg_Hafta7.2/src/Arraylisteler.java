import java.util.*;
public class Arraylisteler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<> Generic türler
		int n=5;
		ArrayList<String> listem=new ArrayList<>();
		ArrayList<String> listem2=new ArrayList<String>(5);
		
		ArrayList<Integer> listem3=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			listem2.add(i+". eleman");
			//Listenin sonuna ekkler
		}
		
		listem2.add(2, "deneme");
		listem2.add("deneme");
		//2.indise eleman ekleme
		
		System.out.println(listem2.indexOf("deneme")); 
		//deneme degeri ilk kacinci indiste yer alır
		
		System.out.println(listem2.lastIndexOf("deneme"));
		//deneme degerinin en son kacinci indiste yer aldigini donderir
		
		System.out.println(listem2.contains("deneme1"));
		//Arraylist deneme ifadesini icerir mi diye bakıyor
		if(listem2.contains("deneme")) {
			System.out.println("Arraylist deneme degerini içerir");			
		}
		else {
			System.out.println("Array list bu ifadeyi içermiyor");
		}
		
		System.out.println(listem2);
		System.out.println("----------------------");
		
		listem2.remove(4);
		//4.indisteki degeri siler
		
		listem2.remove("deneme");
		//arraylistede ilk deneme degeri silinir
		
		System.out.println(listem2);
		
		listem2.add(1, "5.eleman");
		
		System.out.println("----------------------");
		Collections.sort(listem2);
		//A-->Z sıralama
		System.out.println(listem2);
		
		System.out.println("----------------------");
		Collections.sort(listem2, Collections.reverseOrder());
		//Z-->A sıralama
		System.out.println(listem2);
		
		for (String a: listem2) {
			System.out.println(a);
		}
		
		int arraylistboyut=listem2.size();
		for (int j = 0; j < listem2.size(); j++) {
		 	System.out.println( listem2.get(j));
		}
		
		listem2.set(0, "XXXXXXXXXXXXXX");
		//0. indisdeki degeri XXXXXXXXXXXXXX yapar.
		System.out.println(listem2);
		
		listem2.clear();
		//Arraylisti temizleme
		System.out.println(listem2);	
	
		

	}

}
