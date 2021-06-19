package bütünleme;
import java.util.*;
public class Dördüncü_Bölüm_2 {
	static int BirsayiGir() {
		Scanner oku=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		return oku.nextInt();
	}
	
   public static void main(String argc[]) {
	     int a=BirsayiGir();
	     int b=BirsayiGir();
	     int c=BirsayiGir();
	     int disk=b*b-4*a*c;
	     System.out.println(disk);
	     if(disk<0) {
	    	 System.out.println("Gerçek kökü yoktur.Tekrar deneyiniz");
	     }
	     else {
	    	 int payda =2*a;
	    	 double x1=(-b+Math.sqrt(disk))/payda;
	    	 double x2=(-b-Math.sqrt(disk))/payda;
	    	 System.out.println(x1+"\n"+x2);
	     }
   }
}
