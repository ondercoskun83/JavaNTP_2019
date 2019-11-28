
public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Uret a=new Uret(i);			
		}		
		System.gc();		
		for (int i = 11; i < 15; i++) {
			Uret a=new Uret(i);			
		}		
		System.gc();

	}

}

class Uret{
	int i=0;
	//Kurucu fonksiyon
	Uret(int y){
		this.i=y;
		System.out.println("Object oluşturuldu:"+(i+1));
	}
	
	//Yikici fonksiyon
	public void finalize() {
		System.out.println("Object silindi:"+(i+1));
	}	
	
	
	
	
}
