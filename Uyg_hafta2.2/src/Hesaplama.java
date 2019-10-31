public class Hesaplama {
	public static void HesaplaWhile(int deger1, int deger2) {
		double toplam=0, carpim=1, ortalama=0;
		int sayit=0, sayic=0, sayio=0;
		
		int sayac=Math.min(deger1, deger2);
		while (sayac<Math.max(deger1, deger2)) {			
			sayac++;
			if(sayac%3==0 && sayac%5==0) {
				sayio++;
				ortalama+=sayac;
			}	
			//ortalamada sayio 0 olması durumu try-catch ile cozulebilir
			//sayio baslangic degeri 1 verilerek ilk girisi
			//kontrol edilip if(sayio==1) continue; else sayio++;
			//ortalama hesabi dogrudan kontrol icerisinde yapilabilir
			
			if (sayac%3==0) {
				sayit++;
				toplam+=sayac;						
			}
			if(sayac%5==0){
				sayic++;
				carpim*=sayac;
			}						
		}
		
		
	}
	
	public static String HesaplaFor(int deger1, int deger2) {
		double toplam=0, carpim=1, ortalama=0;
		int sayit=0, sayic=0, sayio=0;
		String dondurulen="";
		
		int sayac=0;
		for (sayac=Math.min(deger1, deger2); sayac < Math.max(deger1, deger2); sayac++) {
			if(sayac%3==0 && sayac%5==0) {
				sayio++;
				ortalama+=sayac;
			}	
			
			if (sayac%3==0) {
				sayit++;
				toplam+=sayac;						
			}
			if(sayac%5==0){
				sayic++;
				carpim*=sayac;
			}			
		}
		
		dondurulen+= sayit+" sayının Toplamı:"+toplam +"\n";
		dondurulen+= sayic+" sayının Carpimi:"+carpim+"\n";		
		dondurulen+= sayio+" sayının Ortalamasi:"+(ortalama/sayio)+"\n";
		
		return dondurulen;
	}
	
	
}
