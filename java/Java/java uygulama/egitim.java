package javacalisma;

public enum egitim {
	ilkokul(8,"Meb"),
	lise(4,"Meb"),
	lisans(4,"Yok"),
	master(2,"Yok"),
	doktora(4,"Yok");
	
	int sure;
	String kurum;
	egitim(int deger, String deger2){
		this.sure=deger;
		this.kurum=deger2;
	}
public int getSure() {
	return this.sure;
}
public String getKurum() {
	return this.kurum;
}
public String toString() {
	return this.name()+"  "+this.sure+"  "+this.kurum;
	//return this.getSure() +""+this.getKurum();
}
}
