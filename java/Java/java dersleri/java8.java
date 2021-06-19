package bütünleme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class java8 extends JFrame {
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField paswordf;
	
	public static void main(String argc[]) {
		ch14_3 deneme=new ch14_3();
		deneme.setTitle("denemedir");
		deneme.setSize(400, 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
	}
	
	ch14_3(){
		super("testir ha");
		setLayout(new FlowLayout());
		text1=new JTextField(10);
		add(text1);
		
		text2=new JTextField("sağlam field");
		add(text2);
		
		text3=new JTextField("değiştiremezsin paşa",21);
		text3.setEditable(false);
		add(text3);
		
		paswordf =new JPasswordField("gizli yazı");
		add(paswordf);
		
		TextFieldHandler handler=new TextFieldHandler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		paswordf.addActionListener(handler);
	}

	private class TextFieldHandler implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
			String a=" ";
			
			if(event.getSource()==text1) {
				a=String.format("text1: %s ", event.getActionCommand());
			}
			else if(event.getSource()==text2) {
				a=String.format("text2: %s", event.getActionCommand());
			}
			else if(event.getSource()==text3) {
				a=String.format("text3: %S", event.getActionCommand());
				
			}
			else if(event.getSource()==paswordf) {
				a=String.format("paswordf:%s", event.getActionCommand());
				
			}
			JOptionPane.showMessageDialog(null,a);
		}
		
	}

}
