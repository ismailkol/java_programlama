package bütünleme;

public class j_16 {
   public static void main(String argc[]) {
	   //String basit veri tipi değildir.Türetilmiştir.
	   String a="ismail kol";
	   System.out.println("isim:"+a);
	   System.out.println(a.length());
	   String b="samet burhan";
	   System.out.println(b.length());
	   System.out.println(b.contains("ş"));//içinde varsa true döner.
	   System.out.println(b.contains("i"));
	   String c="suleyman kesat";
	   System.out.println(c.length());
	   System.out.println(c.contains("t"));
	   System.out.println(c.contains("i"));
	   System.out.println(c.indexOf("h"));
	   System.out.println(" \n \n \n");
	   
	   String Ad="ismail";
	   String SoyAd="kol";
	   System.out.println(Ad+" " +SoyAd);
	   String Sayı1="70";
	   String Sayı2="30";
	   System.out.println(Sayı1+Sayı2);
	   System.out.println("Aritmetik toplama="+(70+30));
	   
	   
	   
	   
   }
}
