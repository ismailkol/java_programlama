package bütünleme;
import javax.swing.*;
public class bolum4 {

	
	public static void main(String argc[]) {
		JFrame iso=new JFrame("Bir elemanlı GUI");
		JButton ok=new JButton("OK");
		iso.add(ok);
		iso.setSize(400,300);
		iso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iso.setLocationRelativeTo(null);
		iso.setVisible(true);
		
	}
}
