package bütünleme;
import java.util.*;
public class Dördüncü_Bölüm_1 {
   public static void main(String argc[]) {
	   javax.swing.JOptionPane.showMessageDialog(null, "Hoşgeldiniz", "mesaj", javax.swing.JOptionPane.PLAIN_MESSAGE);
	  //İKİNCİ parametre içeriye yazılacak 3. başlık 4. ekranda ne ıle gelsın
	   //QUESTION,PLAIN,ERROR,WARNING,INFORMATION çeşitleri vardır.
	   System.out.println("Değer:");
	   Scanner oku=new Scanner(System.in);
	   String d=oku.next();
	   System.out.println(d);
	   Scanner oku2=new Scanner(System.in);
	   char ch=oku2.next().charAt(0);
	   System.out.println(ch);
	   Scanner oku3=new Scanner(System.in);
	   int in=oku.next().charAt(0);
	   System.out.println(in);
	   Scanner oku4=new Scanner(System.in);
	   double dob=oku4.nextDouble();
	   double ondalık=Double.parseDouble(d);
	   // string olarak girilen değeri double çevirir.
	   
	   
   }
}
