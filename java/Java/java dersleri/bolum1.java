package bütünleme;
import javax.swing.*;
public class bolum1 {
/*
 GUI nesneleri ->JButton,JLabel,JtextField,JCheckBox,JRadioButton ve JComboBox 
 sınıfları tarafından oluşturulucaktır.
 System.out.println(isim + instanceof + sınıf) ile nesne oluşturuldumu diye kontrol
 edilir oluşturulmuş ise true değilse false değeri geri döndürecektir.
 */
   public static void main(String argc[]) {
	   //Üzerinde ok yazan bir düğme oluşturma.
	   JButton jbtOk=new JButton("OK");
	   System.out.println(jbtOk instanceof JButton);
	   
	   //Üzerinde adınızı giriniz yazan bir etiket oluşturma.
	   JLabel jlbAd=new JLabel("Adınızı giriniz:");
	   System.out.println(jlbAd instanceof JLabel);
	   
	   //Metin Alanı oluşturma
	   JTextField jtfAdi=new JTextField("Kendinizi tanıtınız:");
	   System.out.println(jtfAdi instanceof JTextField);
	   
	   //Üzerinde bold yazan bir onay kutusu oluşturma
	   JCheckBox jchkbx=new JCheckBox("Bold");
	   System.out.println(jchkbx instanceof JCheckBox);
	   
	   //Üzerinde kırmızı yazan bir seçme halkası oluşturma
	   JRadioButton jrbKırmızı=new JRadioButton("Kırmızı");
	   System.out.println(jrbKırmızı instanceof JRadioButton);
	   
	   //Üzerinde kırmızıyeşil mavi yazan seçim yapabileceğimiz combo halkası oluştur.
	   JComboBox jcbRenk =new JComboBox(new String[] {"kırmızı","yeşil","mavi"});
	   System.out.println(jcbRenk instanceof JComboBox);
   }
}
