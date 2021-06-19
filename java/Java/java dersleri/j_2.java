package bütünleme;
import javax.swing.*;
import java.awt.*;
public class Onbirinci_Bölüm_9 extends JFrame {
	
	/*
	 * JScrollPane sınıfı, taşıdığı bileşeni kaydırarak diğer elemanların görünmesini sağlar.
	 Farz edelim ekranda bir resim var ve tamamını kaplıyordur.Bu resmi kaybetmeden ekranda başka 
	 şeylerde görmek istiyorsunuz bunun için en akıllı iş remi küçültmek veya kaydırmaktır.JScrollPane
	 sınıfı resmi çevçevesini değitirmeden içindeki görüntüyü kaydırmabilmeyi sağlıyordur.
	 */
	
	public static void main(String argc[]) {
		JFrame deneme=new JFrame();
		deneme.setTitle("JScrollPane");
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setSize(400, 400);
		deneme.setVisible(true);
		
		//ekiket oluşturma ve buun içine resim atama;
		JLabel resim=new JLabel(
				new ImageIcon("/home/iso/Pictures/Screenshot from 2019-11-08 19-17-17.png"));
		//kaydırma alanı oluşturma ve onu içine atama işlemi
		JScrollPane kaydırma=new JScrollPane(resim);
		
		//yatay ve dikey kaydırma işlemleri
		kaydırma.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//kaydırma.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		deneme.getContentPane().add(resim);
		deneme.repaint();
		
	}

}
