package bütünleme;
import javax.swing.*;
import java.awt.*;
public class Onikinci_Bölüm_2 extends JFrame {

	/*
	 Java grafik ve nokta çizme konusunda büyük kolaylık sağlar.Bu iki temel eleman kullanılarak
	 herhangi birşey çizebiliriz.
	 Kolayca grafik çizebilmek için Graphics sınıfı tanımlanmıştır.
	 doğru(line),dikdörtgen(rectangle),oval(oval),yay(arc),poligon(polygon) ve birçok şey
	 çizilebilir.
	  void setColor(Color) ->> renk seçimi eder.
	  void setFont(Font) ->> font seçimi eder.
	  void drawString(string,int,int) -> (x,y) noktasından başlayan stringi yazar.
	  void drawLine(int,int,int,int) ->(x1,y1) ve (x2,y2) noktasından geçen doğruyu çizer.
	  void drawRect(int,int,int,int) -> sol-üst kosesi x,y olan bir dikdörtgen çizer.
	  void drawOval(int,int,int,int) -> oluşturulan dikdörtgen boyutunda oval çizer.
	  	 
	 */
	 private static JLabel ilklabel=new JLabel("ilk labeldir");
	
	 //parametresiz kurucu metot
	Onikinci_Bölüm_2(){
		Graphics grafik=ilklabel.getGraphics();
		System.out.println(grafik);
	}
	
	
	
	public static void main(String argc[]) {
		
		Onikinci_Bölüm_2 deneme=new Onikinci_Bölüm_2();
		deneme.setTitle("denemedir");
		deneme.setSize(400,100);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setLocationRelativeTo(null);
		deneme.setVisible(true);
		deneme.add(ilklabel);
		
	}
}
