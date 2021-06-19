package bütünleme;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class java9  extends JFrame{
	private JButton plainb;
	private JButton fancyB;

	
	public static void main(String argc[]) {
		java9 deneme=new  java9();
		deneme.setTitle("denemedir");
		deneme.setSize(400 , 100);
		deneme.setLocationRelativeTo(null);
		deneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deneme.setVisible(true);
	}
	ch14_4(){
		super("paşaların paşası");
		setLayout(new FlowLayout());
		plainb=new JButton("plain button");
		add(plainb);
		
		fancyB=new JButton("fancy");
		add(fancyB);
		
		ButtonHandler handler=new ButtonHandler();
		plainb.addActionListener(handler);
		fancyB.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
		
	}
}
}
