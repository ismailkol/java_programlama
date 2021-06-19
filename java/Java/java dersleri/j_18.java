package bütünleme;
import java.util.*;
public class j_18 {
   public static void main(String argc[]) {
	   
	   int x=10;
	   int y=5;
	   boolean z=x<y;
	   System.out.println(z);
	   z=x>y;
	   System.out.println(z);
	   System.out.println("Tabanı giriniz.");
	   Scanner input1=new Scanner(System.in);
	   int taban=input1.nextInt();
	   System.out.println("Üstü giriniz");
	   Scanner input2=new Scanner(System.in);
	   int üs=input2.nextInt();
	   System.out.println(Math.exp(üs*Math.log(taban)));
	   //x=z; sayı boolean dönüştürülemez.
	   //z=x; boolean sayıya dönüştürülemez.
	   // bölme işleminde bir tane sayının ondalık sayı olması sonucu ondalık sayı 
	   //etmeye yarıyacaktır.
	   //++x ilk attırılır sonra işlem edilir.
	   //x++ ilk işlemler edilir sonra attırılır.
	   
   }
}
