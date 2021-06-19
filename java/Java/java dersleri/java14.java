package bütünleme;

public class İkinci_Bölüm_3 {
   public static void main(String argc[]) {
	   
	   System.out.println("ismail kol");
	   //System sınfının out nesnesinin println metodu çalıştırılmaktadır.
	   //genel(global) değişken claslarda tanımlanırlar. ömürlerin sınıfın ömrü kadardır.
	   //yerel(local) değişken metotlar içinde tanımlanır.
	   //farklı metotlarda aynı ısımlı yerel değişkenler olabilir.
	   //yerel (local) değişkenler metotların ömrü kadardır.
	   //Sınıflar RAM belleğin heap bölgesinde yerleştiği için global değişkenlerde orda
	   //tutulmaktadır.
	   //Yerel değişkenler RAM de stack bölgesinde tutulmaktadırlar.
	   int x=1;
	   int y;
	   //local değişkenlere bir değer atamadan ekrana yazdırmak hata sebebedir.
	   //y=y+x; y local değişken ve tanımlı olmadıgından hata verir.
	   y=1+x; //çalışır bir sıkıntı vermez...
	   System.out.print(x+"\n");
	   System.out.print(y+"\n"); 
	   
	   final double PI=3.14;
	   //PI=2.95; final ile tanımlanmıs değer değiştirilemez(c++ const deger gibi)
	   double YariÇap=10;
	   double DaireAlan=PI*YariÇap*YariÇap;
	   System.out.println("Dairenin Alanı:"+DaireAlan);
	   
   }
}
