package bütünleme;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;
public class ch23_1 extends JPanel{
	

	public void paint(Graphics g) {
		Dimension dm=this.getPreferredSize();
		g.drawString("iso", 170, 25);
	}
	
	public static void main(String argc[]) {
		JFrame deneme=new JFrame();
		deneme.getContentPane().add(new ch23_1());
		
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setSize(200, 200);
		deneme.setVisible(true);
		
	}
	
}
