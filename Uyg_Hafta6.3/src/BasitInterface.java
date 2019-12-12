
public interface BasitInterface {
	final int a=10;
	
	//Abstract fonksiyon tanimlama
	void Goruntule();
	int DegerGetir(int a, int b);
	double Degerler();
	//Interface icerisinde static ve fimnal fonksiyonları kullanılamaz
	//static double Deneme();
	//final double Deneme2();
	//Interface icerisinde abstract fonksiyon tanimlanabilir
	/*
	public String Deneme() {
		System.out.println("Goruntule fonksiyonu cagirildi");
		return "";
	}
	*/
	
}

interface BasitInterface2{
	int Durum1();
	double Durum2(int b);
}

//Birden fazla Interface kalıtıldı
class TestInterface2 implements BasitInterface2, BasitInterface{
	@Override
	public void Goruntule() {
		// TODO Auto-generated method stub
		System.out.println("Goruntule fonksiyonu cagirildi");
	}
	@Override
	public int DegerGetir(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Degerler() {
		// TODO Auto-generated method stub
		return 0;
	}	
	public void Deneme() {
		System.out.println("Ekstra fonksiyon yazilabilir");
	}
	@Override
	public int Durum1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Durum2(int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}



//Interface den kalitim yapmak icin implements kullanilir
class TestInterface1 implements BasitInterface{	
	@Override
	public void Goruntule() {
		// TODO Auto-generated method stub
		System.out.println("Goruntule fonksiyonu cagirildi");
	}
	@Override
	public int DegerGetir(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Degerler() {
		// TODO Auto-generated method stub
		return 0;
	}	
	public void Deneme() {
		System.out.println("Ekstra fonksiyon yazilabilir");
	}	
}

//Tek siniftan tek sinifa kalitim mumkun
class DenemeClass extends TestInterface1{
	
}
// Birden fazla class in tek sinifa kalitimi Mumkun degildir
/*
class DenemeClass2 extends TestInterface1, TestInterface2{	
}
*/


