package bütünleme;
import java.awt.*;
import javax.swing.*;
public class ders4 extends JPanel {

	private double sum;
	public void init() {
		String f1=JOptionPane.showInputDialog("sayı gir");
		String f2=JOptionPane.showInputDialog("sayı2 gir");
		double n1=Double.parseDouble(f1);
		double n2=Double.parseDouble(f2);
		double top=n1+n2;
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(100, 100, 27, 15);
		g.drawString("selam", 15, 15);
	}
	public static void main(String argc[]) {
		
		JFrame deneme=new JFrame();
		deneme.getContentPane().add(new ders4());
		deneme.setTitle("denemedir");
		deneme.setSize(200, 200);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
	}
}
