package bütünleme;
/*
 * Basit veri tipleri RAM belleğe yerleştirilir.Program çalıştıkça bellekte kalırlar.
 * BAsit olmayan değişkenler bellekte hemen yer almazlar fakat eğer new işlemcisi kullanılarak bunlara
 * bellekten yer ayırtılır.
 * String basit veri tipi değildir türetilmiştir.
 * Referans değişkenler verinin bellekte işgal ettiği yerin adresini taşıyan adreslerdir.
 * Class,enum ve dizi basit olmayan veri tipleridir.
 */
public class java1 {
	static int yaricap;
	static double alan;
	public static double AlanHesap() {
		return 3.14*yaricap*yaricap;
	}
   public static void main(String argc[]) {
	   
	   yaricap=10;
	   System.out.println(AlanHesap());
   }
}
