package bütünleme;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class j_6 extends JFrame implements ItemListener {


	
	private JCheckBox defter,silgi,kalem,kitap;
	private JTextArea textAlanı;
	
	
	public static void main(String argc[]) {
		Ondördüncü_Bölüm_3 deneme=new Ondördüncü_Bölüm_3();
		deneme.setTitle("denemedir");
		deneme.setSize(700, 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
		
		deneme.GUIoluşturma();
		
	}

	private void GUIoluşturma() {
		//Container cn=new Container();
		Container cn=getContentPane();
		cn.setLayout(new FlowLayout());
		
		defter=new JCheckBox("defter");
	    cn.add(defter);
	    defter.addItemListener(this);
	    
	    kalem=new JCheckBox("kalem");
	    cn.add(kalem);
	    kalem.addItemListener(this);
	    
	    silgi=new JCheckBox("silgi");
	    cn.add(silgi);
	    silgi.addItemListener(this);
	    
	    kitap =new JCheckBox("kitap");
	    cn.add(kitap);
	    kitap.addItemListener(this);
	    
	    textAlanı =new JTextArea(4,7);
	    cn.add(textAlanı);
	}
	
	
	public void itemStateChanged(ItemEvent e) {
		String yeniSatir="\n";
		textAlanı.setText(" ");
		// seçildi mi diye kontrol ediyor seçildiyse textalanına bunu bildiriyor
		if(defter.isSelected()) {
			textAlanı.append("defter seçildi"+ "\n");
		}
		if(kitap.isSelected()) {
			textAlanı.append("kitap seçildi"+"\n");
		}
		if(silgi.isSelected()) {
			textAlanı.append("silgi seçildi"+"\n");
		}
		if(kalem.isSelected()) {
			textAlanı.append("kalem seçildi"+"\n");
		}
		
	}
}
