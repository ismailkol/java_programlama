package bütünleme;

import javax.swing.JOptionPane;

public class Altıncı_Bölüm_2 {

	static int YariÇap;
	static double alan;
	
	static void oku() {
		String input=JOptionPane.showInputDialog(null, "yariçap ", "yariçap ", JOptionPane.WARNING_MESSAGE);
		int Deg=Integer.parseInt(input);
		YariÇap=Deg;
		
	}
	public static double AlanHesapla() {
		return 3.14*YariÇap*YariÇap;
	}
	public static void main(String argc[]) {
		oku();
		System.out.println(AlanHesapla());
		
	}
	
}
