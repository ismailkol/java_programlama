package bütünleme;
import java.awt.*;
import javax.swing.*;
public class j_3 extends JFrame {
/*
 * JTabbedPane üzerinde taşıdığı panelleri bölünmüş sekmeler şeklinde sıralar.Bu sayede istenilen
 * sekme kolayca seçilebilir.
 * 
 */
	
	
	
	public static void main(String argc[]) {
		
		JFrame deneme=new JFrame();
		deneme.setTitle("JTabbedPane SINIFI ");
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setLocationRelativeTo(null);
		deneme.setSize(400, 200);
		deneme.setVisible(true);
		
		deneme.setLayout(new FlowLayout());
		//içi boş bir panel oluşturma
		JTabbedPane TabbedPane =new JTabbedPane();
		TabbedPane.setPreferredSize(new Dimension(400,100));
		//sekmelerin panelin sağına eklenmesidir.
		TabbedPane.setTabPlacement(TabbedPane.RIGHT);
		//panellerin oluşturulmasıdır.
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		
		//tab sekmesine panellerin eklenmesi
		TabbedPane.add("ismail kol",p1);
		TabbedPane.add("bil müh",p2);
		TabbedPane.add("ktü",p3);
		TabbedPane.add("java programing",p4);
		TabbedPane.add("3.sınıf",p5);
		
		//sekmelere ayrılan panelin çevçeveye eklenmesi
		deneme.getContentPane().add(TabbedPane);
		deneme.repaint();
		// numaralanmış başlığı geri döndürür.
		System.out.println("TabbedPane.getTitleAt(0):"+TabbedPane.getTitleAt(0));
		System.out.println("TabbedPane.getTitleAt(3):"+TabbedPane.getTitleAt(3));
		//toplam sekme sayısını geri döndürür.
		System.out.println("TabbedPane.getTabCount():"+TabbedPane.getTabCount());
		//belirtilen sekmeye ipuci atar.
		System.out.println("TabbedPane.getToolTipTextAt(1):"+TabbedPane.getToolTipTextAt(1));
		//sıra numarısını geri döndürür.Bulamazsa -1 gönderir
		System.out.println("TabbedPane.indexOfComponent(p4):"+TabbedPane.indexOfComponent(p4));
		//içinde olanı bulur bulamazsa -1 gönderir.
		System.out.println("TabbedPane.indexOfTab(enes):"+TabbedPane.indexOfTab("enes"));
		
		
		
		
		
		
	}
}
