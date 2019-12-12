
public class Hayvan {
	public static double kilo=0, Boy=0;
	public static String yasananYer="";
	//Parametresiz kurucu
	Hayvan() {
		System.out.println("Hayvan kurucu tetiklendi");
	}
	//Parametreli kurucu
	Hayvan(double kilo) {
		System.out.println("Hayvan kurucu tetiklendi. Kilo:"+kilo);
	}
	
	//Kurucu fonksiyon degil her ne kadar kurucu ismiyle ayni olsa da 
	// Bu normal bir fonksiyon olarak calisir
	public void Hayvan() {
		System.out.println("Hayvan kurucusu degil Hayvan void fonksiyonu tetiklendi");
	}
	
	
	public void Beslenme() {
		System.out.println("Hayvan Beslenme tetiklendi. Her hayvan beslenir.");
	}
	public static void YasadigiYer() {
		System.out.println("Hayvan YasadigiYer tetiklendi");
	}
	public void Solunum() {
		System.out.println("Hayvan Solunum tetiklendi. Her hayvan solunum yapar");
	}
	public void CeneYapisi() {
		System.out.println("Hayvan Ceneyapisi tetiklendi. Her hayvan bir çene yapısına sahiptir.");
	}
}

class Etcil extends Hayvan{
	public Etcil() {
		System.out.println("Etçil kurucu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Etcil Beslenme tetiklendi. Etçiller etle beslenir.");
	}
	
	/*
	//statik tanımlı fonksiyonlar override edilemez. Çünkü RAMda belirli bir adres ayrılmıştır.
	@Override
	public static void YasadigiYer() {
		System.out.println("Hayvan YasadigiYer tetiklendi");
	}
	*/
	
	@Override
	public void CeneYapisi() {
		System.out.println("Etçillerin kesici dişleri daha gelişmiştir.");
	}
	
	
	
}


class Otcul extends Hayvan{
	public Otcul() {
		System.out.println("Otcul kurucu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Otcul Beslenme tetiklendi. Otcullar otla.");
	}
	
	@Override
	public void CeneYapisi() {
		System.out.println("OtcullaRIN öğütücü dişleri daha gelişmiştir.");
	}
	
	public void MideYapisi() {
		System.out.println("Otçulların midesi 4 bölümdür.");
	}
	
}




class Kuslar extends Etcil{
	public Kuslar() {
		System.out.println("Etçil kuşlar kurucu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Etcil Kuşlar Beslenme tetiklendi. Etçiller etle beslenir.");
	}
	
	@Override
	public void CeneYapisi() {
		System.out.println("Etçil kuşların gagaları sivridir.");
	}
	
}

