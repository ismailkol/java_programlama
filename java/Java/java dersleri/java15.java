package bütünleme;

public class java15 {
	static final double pi=3.14;
	static int YariÇap=10;
	//static tanımlamak zorundasındır.
	
  public static void main(String argc[]) {
	  boolean a=true;
	  System.out.println("a=" +a+"\n");
	  //Sınıflarda yer alan veriler,genel olarak sınıflarda(metotlarda değil!)
	  //tanımlaan sabitler ve değişkebnler tarafından temsil edilir.
	  //Bunlara sınıfın alan bileşenleri denir.
	  
	  double DaireAlani=pi*YariÇap*YariÇap;
	  System.out.println("Dairenin Alanı="+DaireAlani);
  }
}
