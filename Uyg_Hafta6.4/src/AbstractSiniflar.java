//Abstract siniflar
public class AbstractSiniflar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstracty siniflardan dogrudan nesne turetilemez. 
		//Turetilen siniflarda ıoverride edilerek yeni sinniftan nesne turetilir
	}

}

abstract class Asker{
	int yas=18;
	//Set fonksiyonu
	public void setYas(int yas) {
		this.yas=yas;
	}
	//Get fonksiyonu
	public int getYas() {
		return yas;
	}
	
	//Normal class tanımlamasında abstract fonk tanımlanamaz
	//Abstract tanımlaması yalnızca tür ve fonksiyon adı içerir
	//Herhangi bir kod blogu barındırmaz
	public abstract void Yetki();
	
	//Final yapılar herhangi bir değişikliğe uğratılamaz.
	//Kalıtım sonrası türetilen yeni sınıflarda Override edilemez
	public final void EnUstKomuta(String durum) {
		if(durum=="OHAl") {
			System.out.println("Askeriyeyi Cumhurbaşkanı komuta eder.");
		}
		else {
			System.out.println("Askeriyeyi Genel Kurmay başkanı komuta eder");
		}
	}	
}


class Generaller extends Asker{
	//Abstract sınıftan türetilen bir class her haklukarda abstract 
	//fonksiyonları override etmelidir
	@Override
	public void Yetki() {
		System.out.println("Yetki zinciri kontrol edilmeli");
	}
	
	//Final metotlar override edilemez
	/*
	@Override
	public final void EnUstKomuta(String durum) {
		
	}
	*/
}
