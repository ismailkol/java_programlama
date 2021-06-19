package javacalisma;

public class ogrenci {
 String isim;
 String soyİsim;
 ders dersListesi[];
 public ogrenci(String deger1 , String deger2, ders[] deger3) {
	 this.isim=deger1;
	 this.soyİsim=deger2;
	 this.dersListesi=deger3;
 }
 public double notOrtlaması() {
	 double ortalama=0;
	 int i=0;
	 for(;i<this.dersListesi.length;i++) {
	   ortalama=ortalama+this.dersListesi[i].not;
	   
	 }
	 ortalama=ortalama/i;
	 return ortalama;
 }
}
