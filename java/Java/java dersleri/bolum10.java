package bütünleme;
import javax.swing.*;
//diyalog kutusundan string alarak stringi dönüştürme
public class Dördüncü_Bölüm_3 {
   public static void main(String argc[]) {
	System.out.println("Tam sayı girisi:");
	   String str=JOptionPane.showInputDialog(null, "bok", "bok", JOptionPane.QUESTION_MESSAGE);
	   byte byteDeg=Byte.parseByte(str);
	   System.out.println(byteDeg);
	   short sh=Short.parseShort(str);
	   System.out.println(sh);
	   int i=Integer.parseInt(str);
	   System.out.println(i);
	   float f=Float.parseFloat(str);
	   System.out.println(f);
	   double d=Double.parseDouble(str);
	   System.out.println(d);
   }
}
