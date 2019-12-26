//Ic-ice siniflar: Nested Class
import java.util.ArrayList;
//Kapsulleme Encapsulation uygulmasi
//Performansi artirir
//Daha okunabilir ve uygulanabilir kod bloklari saglar
//Mantiksal gruplama saglar
public class Rektorluk {
	public int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rektorluk r1=new Rektorluk();
		r1.x=66;
		
		// RektorlukBirimi bu erisimi dogrudan saglayan static olmasidir
		Rektorluk.Fakulteler fk=r1.new Fakulteler();
		fk.Goster();
		fk.xGoster(999);
		
		//Rektorluk.Fakulteler fk2=new Rektorluk.Fakulteler();
		//Universite olusmadan fakulte kurulmaya calisiliyor hata.
		
		Rektorluk.DaireBaskanliklari db=r1.new DaireBaskanliklari();
		db.Goster();
		db.xGoster(555);
		
		
		//x degerlerine main icerisinden erisim
		
		System.out.println("------------------");
		System.out.println(r1.x);    //Rektorluk x degeri (Super x)
		System.out.println(db.x);    //Daire basjkalnlik x degeri (sub x) 
		
	}
	
	public class Fakulteler{
		public int x=10;
		public ArrayList<String> fakulteler=new ArrayList<String>();
		public void Ekle(String yeni) {
			fakulteler.add(yeni);
		}
		public void Goster() {
			for(String a:fakulteler)
				System.out.println(a);
		}
		
		public void xGoster(int x) {
			System.out.println("Parametre olan x: "+x);
			System.out.println("this.x goster:"+ this.x);
			System.out.println("Rektorluk.this.x goster:"+ Rektorluk.this.x);
		}
		
		class Deneme{
			class Deneme2{
				
			}			
		}
		
	}
	
	public class DaireBaskanliklari{
		public int x=7;
		public ArrayList<String> baskanliklar=new ArrayList<String>();
		public void Ekle(String yeni) {
			baskanliklar.add(yeni);
		}
		public void Goster() {
			for(String a:baskanliklar)
				System.out.println(a);
		}
		
		public void xGoster(int x) {
			System.out.println("Parametre olan x: "+x);
			System.out.println("this.x goster:"+ this.x);
			System.out.println("Rektorluk.this.x goster:"+ Rektorluk.this.x);
		}
		
		class Deneme{
			class Deneme2{
				
			}			
		}
		
	}
	
	
	public static class RektorlukBirimi{
		public String rektor="Prof. Dr. Turkay Dereli";
		//Setter Getter fonksiyonlari
		RektorlukBirimi(String yeni){
			this.rektor=yeni;
		}
		public String getRektor() {
			return rektor;
		}
		
	}
	

}
