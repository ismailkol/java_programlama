package bütünleme;
import java.awt.*;
//GUI sınıfları awt altında toplanmıştır.
/*
 AWt karmaşık projelerde yetersiz kalmaktadır.Bunun içinde swing kullanılmıştır.
 Swing bileşenlerinin başında j yanı(JButton) vs. AWT farklı olması için...
 
 GUI sınıfları üç gruba ayrılır.
 
 Birinci Grup:Depolayıcı(container) sınıfıdır.
 Bu sınıfa JPanel,JFrame,JWindow ve JApplet girer ve bunlar diğer değişkenleri
 elde etmek için kullanılır.
 
 İkinci Grup:Hizmet edici(helper) sınıfıdır.
 Bu sınıfaGraphics,Color,Font,FontMetrics ve Dimension girer ve bunlar nesneleri
 çizmel ve yerleştirmek için bileşenler ve depolayıcılar tarafından kullanılır.
 
 Üçüncü Grup:Bileşen(component) sınıfıdır.
 Bu sınıfta JButton,JTextField,JTextArea,JComboBox,JRadioButton ve JMenu girer bunşar
 JComponent sınıfının alt sınfıdır.
 
 
 */
public class Onbirinci_Bölüm_2 {
   public static void main(String argc[]) {
	   Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
	   System.out.println(dm);
	   
   }
}
