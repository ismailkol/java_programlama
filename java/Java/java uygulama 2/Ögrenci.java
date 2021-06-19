package deneme2;

public class Ögrenci {
private int no;
private String isim;
public Ögrenci(int no) {
	this(no,"ismail kol");
	//iki parametri yapıcı fonksiyon çağrılıyor.
	
}
public Ögrenci(int no, String isim) {
	this.no=no;
	this.isim=isim;
	System.out.println(this.isim+" "+this.no);
}

public static void main(String args[]) {
	Ögrenci d1=new Ögrenci(55);
}
}
