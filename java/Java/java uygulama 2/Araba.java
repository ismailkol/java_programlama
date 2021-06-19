package deneme2;
import java.util.*;
public class Araba {
int date;
int MotorHacmi;
int Beygir;
private static Araba audi;
 Araba(){
	System.out.println("Yapıcı fonksiyon calistrildi\n");
	
}
 Araba(int d, int a , int b) {
	this.date=d;
	this.MotorHacmi=a;
	this.Beygir=b;
}
public void setDate(int a) {
	this.date=a;
}
public void setMotorHacmi(int a) {
	this.MotorHacmi=a;
}
public void setBeygir(int a) {
	this.Beygir=a;
}
public int getDate() {
	return date;
}
public int getMotorHacmi() {
	return MotorHacmi;
}
public int getBeygir() {
	return Beygir;
}
public void otvhesaplama(int a,int b,int c) {
	if((a>1998) && (a<2005)) {
		int katma_deger=0;
		int katma_deger2=0;
		katma_deger=(int)(b*(1.8));
		katma_deger=(int)(c*(2.7));
		int otv;
		otv=(katma_deger+katma_deger2)/2;
		System.out.println(otv);
	}
	else if (a>=2005) {
		int katma_deger=0;
		int katma_deger2=0;
		katma_deger=(int)(b*(2.3));
		katma_deger=(int)(c*(3.4));
		int otv;
		otv=(katma_deger+katma_deger2)/2;
		System.out.println(otv);
	}
	else {
		System.out.println("O aracın vergisi mi olur :D ");
	}
}
public static void main(String args[]) {
	 audi = new Araba(1998,2,240);
	 System.out.println(audi.getBeygir());
	 int a=audi.getDate();
	 int b=audi.getMotorHacmi();
	 int c=audi.getBeygir();
	//audi.otvhesaplama(a, b, c);
	  audi.otvhesaplama(audi.getDate(),audi.getMotorHacmi(),audi.getBeygir());
}   
}
