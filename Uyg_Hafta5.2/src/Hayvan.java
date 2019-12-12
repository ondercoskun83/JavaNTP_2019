
public class Hayvan {
	public double agirlik=0;
	public String aile="";
	int a=5; 
	
	public int publicdegiken=0;
	protected int protecteddegiken=0;
	private int privatedegisken=0;
	/*
	Hayvan(){
		this.a=10;
		this.aile="Hayvan";
		System.out.println("Hayvan kurucusu tetiklendi..");		
	}
	*/
	Hayvan(){
		//this.agirlik class içinde tanimli agirlik degiskeni
		//agirlik ise parametre
		this.agirlik=10;
		this.a=5;
		this.aile="Hayvan";
		System.out.println("Hayvan kurucusu tetiklendi..");		
	}
	
	Hayvan(int agirlik, int a, String deneme){
		//this(); // Kurucu fonksiyonu tetikler
		this("Deneme"); // 
		this.a=a;
		this.aile=deneme;
		this.agirlik=agirlik;
		System.out.println("Hayvan kurucusu parametreli tetiklendi..");		
	}
	
	Hayvan(String aile){
		this.aile=aile;
		System.out.println("Hayvan kurucusu parametreli (String) tetiklendi..");		
	}
	
	public void Goster() {
		System.out.println("Degerler: a:"+ this.a+"    aile:"+this.aile+ "    agirlik:"+ this.agirlik);
	}	
}

class Kuslar extends Hayvan{
	Kuslar(int agirlik){
		this.aile="Kuslar";
		this.agirlik=agirlik;
		System.out.println("Kuşlar kurucusu tetiklendi");
	}
	//@Override
	public void KuslarGoster() {
		super.Goster();
	}	
}


