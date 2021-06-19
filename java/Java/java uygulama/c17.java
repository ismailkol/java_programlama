package javacalisma;
import javax.swing.JOptionPane;
import javax.swing.*;
public class c17 {

	public static void main(String[] args) {
		//showinput ile alınır,showmessage ile basılır
		//show input sadece string deger alır sonra bunlar gereklı durumlara dönüştürülmelidir.
		
		String isim=JOptionPane.showInputDialog("Lütfen isim giriniz");
		JOptionPane.showMessageDialog(null, isim+" "+"hoşgeldiniz");
/*	 String deger1=JOptionPane.showInputDialog("Lütfen bir sayı giriniz");
	 String deger2=JOptionPane.showInputDialog("Lütfen bir sayı giriniz");
    int sayi=Integer.parseInt(deger1);
    int sayi2=Integer.parseInt(deger2);
    */
		 int sayi=Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir sayı giriniz"));
		 int sayi2=Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir sayı giriniz"));
	
    int sonuc=sayi * sayi2;
    JOptionPane.showMessageDialog(null, "Çarpma işlemi sonucu: "+ sonuc);

	}

}
