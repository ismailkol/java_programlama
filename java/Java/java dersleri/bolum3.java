package bütünleme;
import javax.swing.*;
public class Onbirinci_Bölüm_3 {
/*
 GUI de elemanları tutmak için bir applet yada frame(çerçeve) oluşturmak gerekir
 Çerçeve oluşturmak için JFrame sınıfı kullanılır.
 JFrame  üst-seviye(top-level) bir containerdir.(taşıyıcıdır.) 
 JFrame sınıfı metotları---
 JFrame() ->> isimsiz çerçeve oluşturur.
 JFrame (String) ->> başlıklı çevçeve oluşturur.
 void SetSize(int,int) ->> çerçeve büyüklüğüdür.
 void toBack() ->>Çerçeveyi arkaya atar.
 void toFront() ->>Çerçeveyi öne atar.
 Point getLocation(Point) ->> Çerçevenin konumunu POİNT nesnesi olarak verir.
 void setLocation(int,int) ->> Çerçevenin sol üst koşesi
 void setVisible(boolean) ->> Çerçevenin görülebilmesi için true değer alır.
 void setLocation(Point) ->> sol-üst koşeyi POINT olarak gösterir.
 void setDefaultCloseOperation(int) ->> çerçeve kapandığında System.exit() çağırır.
 void setLocationRelativeTo(Component) ->> Çerçevenin yerini belirler null ise 
 merkezde çerçeve yerleştirir.
 */
	
	public static void main(String argc[]) {
		
		JFrame ismail=new JFrame();//isimsiz çerçeve
		JFrame ismail2=new JFrame("kayıplar");
		ismail2.setSize(400, 400);
		ismail2.setLocationRelativeTo(null);
		ismail2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ismail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(ismail.getLocation());
		System.out.println(ismail2.getLocation());
		ismail2.setVisible(true);
		ismail.setVisible(true);
	}
}
