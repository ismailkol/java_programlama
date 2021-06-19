package bütünleme;
import java.awt.*;
import javax.swing.*;
public class Onikinci_Bölüm_4 extends JFrame {
/*
  getGraphics() metodu kullanılıdıgında problem çıkmaktadır.Çizdirilen doğrunun kalıcı olmasını 
  isteniyorsa o zaman dogruyu paintComponent() metodu ile çizmek gerekir.
  Bu metot JComponent sınıfından türetilmiştir.
  proctected void paintComponent(Graphics g) şeklinde tanımlanır.
  
 */
	
	public Onikinci_Bölüm_4(){
		add(new YeniLabel());
	}
	
	public static void main(String argc[]) {
		Onikinci_Bölüm_4 deneme=new Onikinci_Bölüm_4();
		deneme.setTitle("denemedir");
		deneme.setSize(400, 100);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setLocationRelativeTo(null);
		deneme.setVisible(true);
		
		
	}
}
class YeniLabel extends JPanel {
	
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawLine(0, 0, 70, 70);
		g.drawString("denemedir",0, 50);
		g.drawLine(100, 0, 70, 70);
	}
}
