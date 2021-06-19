package bütünleme;
import javax.swing.*;
public class Üçüncü_Bölüm_2 {
   public static void main(String argc[]) {
	   //ASCIIde 0dan 127 kadar aralığı kapsayan 128 karakterlik bir kodlama sistemidir.
	   //Javada 2 byte(16bit) uzunluğunda unicode kodlama sistemi kullanılır.
	   //unicode ASCII tablosunun ilk 128 karakter vardır.
	   char a='A';
	   char b='\u0041';
	   char c='\u0031';
	   char d='\u0018';
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
	 
	  JOptionPane.showMessageDialog(null, "\u0041 \u0042 \u0043", "Unicode", JOptionPane.INFORMATION_MESSAGE);
	  int sayaç=33;
	  for(char i='\u0021';i<='\u0081';i++) {
		  if(sayaç%5 ==0) {
			  System.out.println(sayaç++ +"==>"+i+"   ");
			  
		  }
		  else {
			  System.out.print(sayaç++ +"==>"+i+"   ");
		  }
	  }
	  //printlnde her zaman alt satır eder.
	  //printde etmez.
	  
	  
	  
	  int sayaç2=1;
	  for(char  i=65;i<128;i++) {
		  System.out.println((i));
	  }
	  System.out.println("Bir başka örneğimiz");
	  int Tam;
	  char i;
	  for(i=33;i<=126;i++) {
		  Tam=i;
		  if(Tam %10 ==0) {
			  System.out.println(Tam+ "=>>"+ i+ "  ");
			 
		  }
		  else {
			  System.out.print(Tam +" =>> "+ i+ "   ");
		  }
	  }
	  
   }
}
