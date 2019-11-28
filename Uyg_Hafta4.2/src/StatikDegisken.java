
public class StatikDegisken {
public static int x=0;
public int y=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatikDegisken sd1=new StatikDegisken();
		StatikDegisken sd2=new StatikDegisken();
		
		x=10;
		sd1.y=5;
		
		System.out.println("x degeri:"+x);
		System.out.println("sd1 y degeri:"+sd1.y);
		System.out.println("sd2 y degeri:"+sd2.y);
		System.out.println("sd1 x degeri:"+sd1.x);
		System.out.println("sd2 x degeri:"+sd2.x);
		
		sd2.x=33;		
		System.out.println("x degeri:"+x);
		System.out.println("sd1 x degeri:"+sd1.x);
		System.out.println("sd2 x degeri:"+sd2.x);
		
		StatikDegisken sd3=new StatikDegisken();
		//Yeni turetilse de statik degisken ayni adresi gosterir
		System.out.println("SD3 X degeri:"+sd3.x);
		System.out.println("X degeri:"+x);
		System.out.println("SD1 X degeri:"+sd1.x);		
		System.out.println("SD2 X degeri:"+sd2.x);
		
		
		
		
	}

}
