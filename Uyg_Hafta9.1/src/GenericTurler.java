//Generik Turler: Generic types


class Sifreler<T>{
	public T deger;
	String algoritma="";
	void Cagir() {
		System.out.println(deger.getClass().getName());		
	}
	
	void Olustur() {
		if(deger.getClass().getName()=="java.lang.Integer")
			{			
			System.out.println("Deger Integer");
			}
			
		else if(deger.getClass().getName()=="java.lang.String")
			System.out.println("Deger String");
	}
}

class SifrelerKomplex<T, G>{
	public T deger;
	public G sifreleme;
	
	void Olustur() {
		if(deger.getClass().getName()=="java.lang.Integer")
			{			
			System.out.println("Deger Integer");
			}
			
		else if(deger.getClass().getName()=="java.lang.String")
			System.out.println("Deger String");
		
		if(sifreleme.getClass().getName()=="java.lang.Integer")
		{			
		System.out.println("Deger Integer");
		}
		
	else if(sifreleme.getClass().getName()=="java.lang.String")
		System.out.println("Deger String");
		
	}
}


//Generic icinde generic
 class KendiTipim<M>{
	 public M id;
 }
 
 
 class Odemeler<KendiTipim>{
	 public KendiTipim degiskenTipim;
 }
 
 class Odemeler2<Odemeler>{
	 public Odemeler degiskenTipTipi;
 }



public class GenericTurler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generic Tip
		Sifreler<String> a=new Sifreler<String>();
		a.deger="deneme";
		a.Olustur();
		//Generic Tip
		Sifreler<Integer> b=new Sifreler();
		b.deger=155;
		b.Olustur();
		System.out.println("-------------");
		//Generic Tip 2 tipli
		SifrelerKomplex<Integer, String> c=new SifrelerKomplex();
		c.deger=55;
		c.sifreleme="MD5";
		c.Olustur();
		
		//kendi Generic tip tanimi
		Sifreler<KendiTipim> d=new Sifreler();
		//kendi Generic tip tanimi ile tipin tipi
		Odemeler<KendiTipim<String>> e=new Odemeler();
		e.degiskenTipim.id="";		
		
		
		
		//kendi Generic tip tanimi ile tipin tipinin tipi
		Odemeler2<Odemeler<KendiTipim<String>>> f=new Odemeler2();
		f.degiskenTipTipi.degiskenTipim.id="deneme";
	
		
		
	}

}
