package javacalisma;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;


public class calısma18 extends JFrame{
	public static void main(String args[]) {
		
		JFrame sema=new JFrame();
		sema.setTitle("İLK SEMAMİZ");//semanın ismi
		sema.setSize(250, 250);//semanın boyutları
		sema.setLocation(400, 150);//semanın hangi yerden başlyacagı
		sema.setLayout(new FlowLayout());
		//FlowLayout komutu içerisinde objelerin sıralası ve hangi bölgede cıkacagını ayarlar.
		
		
		JLabel etiket=new JLabel("ilk etiketimiz");
		etiket.setToolTipText("deneme etiketi");
		//etiketin üzerinde gelince bilgi veriyor.
		sema.add(etiket);
		
		
		sema.setVisible(true);//semayı true ise basar false ise basmaz
		
	}

}
