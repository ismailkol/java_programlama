package bütünleme;
import java.awt.*;
import javax.swing.*;

public class java13 extends JFrame {
	İkinci_Bölüm_2(){
	add("Center",new Bayrak());
	setTitle("Bayrak");
	setSize(300,250);
	setVisible(true);
	};
	
	
	
   public static void main(String argc[]) {
	   new İkinci_Bölüm_2();
	   
   }
}

class Bayrak extends Canvas {
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(40, 40, 200, 40);
		g.setColor(Color.red);
		g.fillRect(40, 80, 200, 40);
		g.setColor(Color.yellow);
		g.fillRect(40, 120, 200, 40);
		
		g.setColor(Color.black);
		g.drawString("Almanya", 100, 180);
		
		
		
	}
}
