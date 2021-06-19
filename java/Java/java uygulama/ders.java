package javacalisma;

public class ders {
String dersAdi;
String Hoca;
double not;
public ders(String deger1 , String deger2 , int deger3) {
	this.dersAdi=deger1;
	this.Hoca=deger2;
	this.not=deger3;
}
public ders(String deger1 , String deger2) {
	this.dersAdi=deger1;
	this.Hoca=deger2;
}
public double getNot() {
	return this.not;
}
public String getHoca() {
	return this.Hoca;
}
public String getDersAdi() {
	return this.dersAdi;
}
public void setNot(double deger) {
	this.not=deger;
}
public void setHoca(String deger2) {
	this.Hoca=deger2;
}
public void setDersAdi(String deger3) {
	this.dersAdi=deger3;
}
public String ClassPrint() {
	return this.getDersAdi() +""+this.getHoca()+""+this.getNot();
			}
}
