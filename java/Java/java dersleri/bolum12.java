package bütünleme;
//Formatlı yazdırma ve String sınıfı
public class bolum12 {
   public static void main(String argc[]) {
	   
	   int x=200000000;
	   System.out.println("x:"+x);
	   String s=String.format("%,d", x);
	   System.out.println(s);
	   double y=12345.67890;
	   System.out.println("y:"+y);
	   String s1=String.format("%.1f", y);
	   System.out.println(s1);
	   String s2=String.format("%.2f", y);
	   System.out.println(s2);
	   String s3=String.format("%.3f", y);
	   System.out.println(s3);
	   String s4=String.format("%.4f", y);
	   System.out.println(s4);
	   String s5=String.format("%,.4f", y);
	   System.out.println(s5);
	   //, ayırma işaretidir. yuvarlama işaretidir.
	   //sırasıyla yuvarlama işlemi etmektedir.
   }
}
