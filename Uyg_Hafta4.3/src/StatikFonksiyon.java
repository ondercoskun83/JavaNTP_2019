
public class StatikFonksiyon {
public int x=5;
public static String ad="İSTE"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFonk(4);
		System.out.println("Ad değişkeni:"+ad);
		
		StatikFonksiyon sf=new StatikFonksiyon();
		sf.StaticFonk(6);
		System.out.println("Object Ad değişkeni:"+sf.ad);
		
	}	
	//Static Fonksiyon ile static degisken degeri atama
	public static void StaticFonk(int i){
		ad+="-"+i;		
	}

}
