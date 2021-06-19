package bütünleme;
import javax.swing.*;
import java.awt.*;
public class j_7 extends JFrame  {
	
	private JCheckBox jchkMerkez=new JCheckBox("merkez");
	private JCheckBox jchkBold=new JCheckBox("KAlın");
	private JCheckBox jchkItalıc=new JCheckBox("ITalik");

	
	public static void main(String argc[]) {
		
		Ondördüncü_Bölüm_4 deneme=new Ondördüncü_Bölüm_4();
		deneme.setTitle("denemedi");
		deneme.setSize(500, 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
	}
	
	
	
	public j_7() {
		//mnemonik tuşlar
		jchkMerkez.setMnemonic('M');
		jchkBold.setMnemonic('B');
		jchkItalıc.setMnemonic('I');
		//onay kutularının yerleştirileceği bir panel oluşturma
		JPanel jponaykutusu=new JPanel();
		jponaykutusu.setLayout(new GridLayout(3,1));
		
		jponaykutusu.add(jchkBold);
		jponaykutusu.add(jchkItalıc);
		jponaykutusu.add(jchkMerkez);
		add(jponaykutusu,BorderLayout.EAST);
		
		
	}
	
}
