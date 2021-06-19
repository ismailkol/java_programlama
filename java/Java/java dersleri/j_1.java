package bütünleme;
import java.awt.*;
import javax.swing.*;
public class Onbirinci_Bölüm_8 extends JFrame {

	/*
	 * JTextPane sınıfı; uzun ve çok satırlı metin girişleri imkanı sağlar.Aynı zamanda HTML ve RTF
	 * gibi formatlanmış metinlere imkan verir.Sadece düz metinler söz konusu olduğunda en iyisi
	 * JTextArea sınıfını kullanmaktır.
	 */
	
	
	public static void main(String argc[]) {
		JFrame deneme=new JFrame("denemedir");
		deneme.setTitle("denemedir");
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setLocationRelativeTo(null);
		deneme.setSize(400, 400);
		deneme.setVisible(true);
		
		JTextPane PaneDeneme=new JTextPane();
		deneme.getContentPane().add(PaneDeneme);
		deneme.repaint();
		
	}
}
