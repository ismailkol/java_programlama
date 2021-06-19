package bütünleme;
import java.awt.*;
import javax.swing.*;

public class Ondördüncü_Bölüm_2 extends JFrame {

	
	
	public static void main(String argc[]) {
		
		JFrame deneme=new JFrame();
		deneme.setTitle("Düğme(button) ");
		deneme.setSize(700, 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
		
		
	}
	
	public Ondördüncü_Bölüm_2() {
		ImageIcon tr =new ImageIcon("/home/iso/Desktop/download.gif");
		ImageIcon kz=new  ImageIcon("/home/iso/Desktop/kz.png");
		
		JButton ıconbutton=new JButton("tıkla",tr);
		ıconbutton.setPressedIcon(kz);
		add(ıconbutton);
		
	}
}
