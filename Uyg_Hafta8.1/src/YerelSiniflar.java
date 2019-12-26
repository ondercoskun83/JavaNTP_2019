//Yerel Siniflar: Local Class

public class YerelSiniflar {

	static String regularIfade="[^0-9]";
	public static void TelefonDogrula(String tlfno) {
		final int numaraUzunluk=10;
		//JDK8 sonrasi final tanimalann degere yerel class icinden erisim saglandi
		
		//Yerel sinif fonksiyon icerisinde tanimlanir. Nesne ile is bittiginde 
		//RAM uzerinden geri temizlenir.
		int numDeger=0;
		
		class TelefonNumarasi{
			String temizlenenNumara=null;
			TelefonNumarasi(String tlfno){
				//numaraUzunluk=7;
				//Erisim JDK8 sonrasi mumkun
				
				String temizlenenNumara= tlfno.replaceAll(regularIfade, "");
				//Yukarıda girilen tlfno ya 0-9 danbaska bir deger girilirse temizle
				if (temizlenenNumara.length()==numaraUzunluk) {
					this.temizlenenNumara=temizlenenNumara;
				}
				else {
					this.temizlenenNumara=null;
				}				
			}			
			//Getter fonksiyonu
			public String gettlfNo() {
				return temizlenenNumara;
			}
			
			public void numaraGoster() {
				System.out.println("Telefon No:"+ temizlenenNumara);
			}
		}
		
		TelefonNumarasi numaram=new TelefonNumarasi(tlfno);
		numaram.numaraGoster();
		
		if(numaram.gettlfNo()==null) {
			System.out.println("Hatalı veya eksik giriş yaptınız. Lütfen düzeltin");
		}
		else {
			System.out.println("Düzeltilmiş numara="+ numaram.gettlfNo());
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelefonDogrula("544544544hdh0");
		TelefonDogrula("0(544)544 55 55");
		TelefonDogrula("544-544-5544");
		TelefonDogrula("555-4444");
		
		

	}

}
