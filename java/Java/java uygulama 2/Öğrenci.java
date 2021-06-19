package deneme2;
import java.util.ArrayList;
import java.util.List;
public class Öğrenci {
	private int no;
	private String isim;
	public Öğrenci(int i, String string) {
		this.no=i;
		this.isim=string;
	}
	public void ekle(List<Öğrenci> liste) {
		liste.add(this);
	}
public static void main(String args[]) {
	List<Öğrenci> ogrenciListesi=new ArrayList<Öğrenci>();
    Öğrenci o1=new Öğrenci(1,"ismail");
    Öğrenci o2=new Öğrenci(2,"samet");
    o1.ekle(ogrenciListesi);
    o2.ekle(ogrenciListesi);
   // System.out.println(ogrenciListesi);
    for(int i=0;i<ogrenciListesi.size();i++) {
    	System.out.println(ogrenciListesi.get(i));
    }
    
}
}
