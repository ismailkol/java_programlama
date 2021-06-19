package bütünleme;

public class İkinci_Bölüm_5 {
	
	static void Yaz() {
		System.out.println("Hoşgeldiniz");
		System.out.println("Toplama sonucu="+ topla(100,100));
		System.out.println("Gülegüle");
	}
	static int topla(int a,int b) {
		return a+b;
	}
   public static void main(String argc[]) {
	   int deger1=100;
	   int deger2=200;
	   int toplam=topla(deger1,deger2);
	   Yaz();//metot çağırma...
	   System.out.println("Toplam="+toplam);
	   
	   
   }
}
