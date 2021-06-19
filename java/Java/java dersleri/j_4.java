package bütünleme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Düğmeler javax.swing.AbstructButton sınıfından türetilmiştir.AbstructButton sınıfı ise 
 * javax.swing.JComponent sınıfından türetilmiştir.
 * 
 * JButton()  -> Varsayılan düğme
 * JButton(javax.swingIcon) ->ikonlu düğme oluşturma
 * JButton(String s) ->yazılı düğme oluşturma
 * JButton(String s,Icon ı) ->yazılı ve ıkonlu düğme oluşturma
 */
public class j_4 extends JFrame implements ActionListener  {
	private JButton button;
	private JTextField textAlanı;
	
	
	
	public static void main(String argc[]) {
		
		j_4 deneme=new j_4();
		deneme.setTitle("denemedir");
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setSize(800, 100);
		deneme.setVisible(true);
		deneme.GUIOluşturma();
		
		
	}

	private void GUIOluşturma() {
		Container window=getContentPane();
		window.setLayout(new FlowLayout());
		
		button=new JButton("tıkla");
		window.add(button);
		//buttona basınca bunu bildiren durumdur.
		//null yaparsak bastığını anlayamayız
		button.addActionListener(this);
		
		textAlanı=new JTextField(20);
		window.add(textAlanı);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		textAlanı.setText("düğmeye tıklayınız");
	}

}
