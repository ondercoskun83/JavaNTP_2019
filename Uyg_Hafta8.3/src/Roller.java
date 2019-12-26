
abstract class DevamDurumu{
	public abstract boolean Devam();
	int devamsizlik;
}

class sosyalSorumluluk extends DevamDurumu{
	@Override
	public boolean Devam() {
		if(devamsizlik>15) 
			return true;
		else 
			return false;
	}
	public void DevamsizliktanKalmaDurumuYazdir() {
		if(Devam()) {
			System.out.println("SosyalSorumluluk: Devamsızlıktan kaldınız");
		}
		else {
			System.out.println("SosyalSorumluluk: Devamsizlik hakkiniz hala var");
		}
	}
}

class Tamzamanli extends DevamDurumu{
	@Override
	public boolean Devam() {
		if(devamsizlik>10) 
			return true;
		else 
			return false;
	}
	public void DevamsizliktanKalmaDurumuYazdir() {
		if(Devam()) {
			System.out.println("SosyalSorumluluk: Devamsızlıktan kaldınız");
		}
		else {
			System.out.println("SosyalSorumluluk: Devamsizlik hakkiniz hala var");
		}
	}
}


abstract class Egitim{
	public abstract boolean mezuniyet(double AKTS_ortalama);
}


class lisans extends Egitim{
	@Override
	public boolean mezuniyet(double AKTS_ortlama) {
		if(AKTS_ortlama>=2)
			return true;
		else
			return false;
	}
}

class yukseklisans extends Egitim{
	@Override
	public boolean mezuniyet(double AKTS_ortlama) {
		if(AKTS_ortlama>=2.5)
			return true;
		else
			return false;
	}
}

class ogrenci{
	int ogrno;
	String isim;
	//Roller icin egitim classindan roller tanimlandi
	Egitim egitimSeviyesi;
	//Roller icin Devamdurumu rolleri tanimlandi
	DevamDurumu devamRolu;
}






public class Roller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ogrenci sevgi=new ogrenci();
		sevgi.devamRolu=new sosyalSorumluluk();
		sevgi.devamRolu.devamsizlik=13;
		System.out.println("Sevgi isimli ogrenci devamsizliktan kaldi mi?:"+ sevgi.devamRolu.Devam());		
		
		sevgi.devamRolu=new Tamzamanli();
		sevgi.devamRolu.devamsizlik=13;
		//Yeni nesne tanimlandigi icin deger silinir yeniden atanmali
		System.out.println("Sevgi isimli ogrenci devamsizliktan kaldi mi?:"+ sevgi.devamRolu.Devam());		
		
		//sevgi.devamRolu.DevamsizliktanKalmaDurumuYazdir();
		//Rol atamalarinda Bu fonksiyona dogrudan devamRolu icerisinden erisim imkani verilmez
		//Cunku sevgi.devamRolu=new Tamzamanli(); sadece ustClasstan belirlen rol atamasini saglar.
		//Bu fonksiyona erismek icin dogrudan turetilmesi gerekir
		
		//Rollerle bir iliskisi yoktur yalnizca Inheritance(Kalitim)
		sosyalSorumluluk b=new sosyalSorumluluk();
		b.devamsizlik=555;
		b.DevamsizliktanKalmaDurumuYazdir();
		
		
		
		sevgi.egitimSeviyesi=new lisans();
		System.out.println("Sevgi isimli ogrenci mezun mu?:"+ sevgi.egitimSeviyesi.mezuniyet(2.25));
		
		sevgi.egitimSeviyesi=new yukseklisans();
		System.out.println("Sevgi isimli ogrenci mezun mu?:"+ sevgi.egitimSeviyesi.mezuniyet(2.25));
		
		

		
		
	}

}
