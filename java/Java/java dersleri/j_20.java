package bütünleme;
import javax.swing.*;
public class Üçüncü_Bölüm_9 {
   public static void main(String argc[]) {
	   int n=10;
	   JOptionPane.showMessageDialog(null, "\n 2 ve 3 tam bölünür ? "+(n%3==0 && n%2 ==0)+"\n 2 veya 3 tam bölünür "+(n%3==0 || n%2==0));
	   int m=~n;
	   // bit gösterimidir tersi alınır ve -1 eklenır.
	   System.out.println(m);
	   // + ve * işlemleri aynı veri türü üzerinde işlemler ederler farklı olursa 
	   //tipi küçük olandan büyük olana döüşüm olur ve bu duruma
	   //veri tipi dönüşümü(casting) denir.
	   /*
	    byte -> short,char,int,long,float,double
	    short->char,int,long,float,double
	    char->int,long,float,double
	    int->long,float,double
	    long->float,double
	    float->double
	    */
	   float f=3.144f;
	   int a=(int)f;
	   System.out.println(a);
	   //Küçük veri tipinden büyük veri tipine dönüşümde derleyici kendisi yapar.
	   //Büyük veri tipini küçük veri tipine çevirmek durumunda biz etmeliyiz.
   }
}
