package bütünleme;
import javax.swing.*;
public class ch14_1 {

	
	public static void main(String argc[]) {
		String firstNumber=
		    JOptionPane.showInputDialog("deger gir köpek:");
		String secondNumber=
				JOptionPane.showInputDialog("Deger gir it:");
		
		int num1=Integer.parseInt(firstNumber);
		int num2=Integer.parseInt(secondNumber);
		
		int sum=num1+num2;
		System.out.println("sum:"+sum);
	}
}
