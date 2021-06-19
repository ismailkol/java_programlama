package bütünleme;
import java.awt.*;
import javax.swing.*;
public class java7 extends JFrame {

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	
	
	ch14_2(){
		//super("Testing JLabel");
		setLayout(new FlowLayout());
		label1=new JLabel("label");
		label1.setToolTipText("labeldi");
		add(label1);
		
		Icon resim=new ImageIcon("/home/iso/Pictures/Screenshot from 2020-01-17 23-20-15.png");
		label2=new JLabel("resim ha",resim,SwingConstants.LEFT);
		label2.setToolTipText("resimli label geldi");
		add(label2);
		
		label3=new JLabel();
		label3.setText("labeldir");
		label3.setIcon(resim);
		add(label3);
	}
	public static void main(String atgc[]) {
		
		ch14_2 deneme=new ch14_2();
		deneme.setTitle("deneme");
		deneme.setSize(400, 100);
		deneme.setVisible(true);
	}
}
