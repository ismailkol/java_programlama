package deneme2;
import java.util.*;
public class Ogrenci {
	public String isim;
	public String soyisim;
	
public Ogrenci(String isim, String soyisim) {
	this.isim=isim;
	this.soyisim=soyisim;
	
}
  public void ekle(List<Ogrenci> ogr_lıste) {
	  ogr_lıste.add(this);
  }
  
  public static void main(String args[]) {
	  List<Ogrenci> ogr_liste=new ArrayList<>();
	  Ogrenci o1 = new Ogrenci("enes","karali");
	  Ogrenci o2=new Ogrenci("metehan","çoşkun");
	  o1.ekle(ogr_liste);
	  o2.ekle(ogr_liste);
	  
  }
}
