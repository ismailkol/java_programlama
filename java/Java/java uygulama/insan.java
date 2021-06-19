package javacalisma;
import java.util.Date;
public class insan {
String isim;
String soyİsim;
Date dogumtarihi;
public insan(String deger1 , String deger2, Date deger3) {
	this.isim=deger1;
	this.soyİsim=deger2;
	this.dogumtarihi=deger3;
}
public int yasHesapla() {
	Date bugun=new Date();
	bugun.setYear(2019);
	int sonuc=bugun.getYear()-this.dogumtarihi.getYear();
	return sonuc;
}
}