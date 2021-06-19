package bütünleme;
import java.applet.*;
import java.awt.BorderLayout;

import javax.swing.*;
public class Onbirinci_Bölüm_6 extends JFrame{

	
	
	
	public static void main(String argc[]) {
		
		JFrame deneme=new JFrame("denemdir");
		deneme.setSize(400, 400);
		JButton e=new JButton("doğu");
		JButton w=new JButton("West");
		JButton n=new JButton("North");
		JButton s=new JButton("South");
		JButton c=new JButton("Center");
		deneme.setLayout(new BorderLayout());
		deneme.add(e,BorderLayout.EAST);
		deneme.add(w,BorderLayout.WEST);
		deneme.add(n,BorderLayout.NORTH);
		deneme.add(s,BorderLayout.SOUTH);
		deneme.add(c,BorderLayout.CENTER);
		deneme.setBounds(200, 100, 300, 400);
		// setBounds ile ekrandakı yerını kaydırıyoruz ilk iki kaydırma son iki boyutlardır.
		deneme.setVisible(true);
	}
}
