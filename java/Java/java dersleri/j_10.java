package bütünleme;
import java.awt.*;
import javax.swing.*;
public class j_10 extends JFrame {

	private static JLabel ilklabel=new JLabel("ilk ulan bu");
	
	j_10(){
		Graphics grafik=ilklabel.getGraphics();
		System.out.println(grafik);
	}
	
	public static void main(String argc[]) {
		j_10 deneme=new j_10();
		deneme.setTitle("denemedir");
		deneme.setSize(400, 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
		deneme.add(ilklabel);
		JOptionPane.showMessageDialog(null, "çıkmak için tıklayınız");
		Graphics graf=deneme.ilklabel.getGraphics();
		graf.drawOval(200, 0, 60, 60);
	}
}
