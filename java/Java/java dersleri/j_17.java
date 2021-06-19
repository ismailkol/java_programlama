package bütünleme;

public class Üçüncü_Bölüm_6 {
   public static void main(String argc[]) {
	   
	   //Stringlerde karşılaştırma unicode göre yapılmaktadır.
	   String s1="Mehmet";
	   String s2="Murat";
	   String s3="Ali";
	   String s4="Ahmet";
	   String s5="Can";
	   String s6="İlhan";
	   //compareTo kullanılırken ascıı degerlerine bakılarak işlem edilir.
	   //e=101 u=117 e-u=-16 e daha küçüktür demektir.
	   System.out.println(s1.compareTo(s2));
	   System.out.println(s2.compareTo(s2));
	   System.out.println(s3.compareTo(s2));
	   System.out.println(s4.compareTo(s2));
	   System.out.println(s5.compareTo(s2));
	   
	   //char a=108;
	   //System.out.println(a);
	   
	   String [] s= {"Enes","Veli","Ismail","Kadriye","Metehan"};
	   String yedek;
	   for(int i=0;i<s.length;i++) {
		   for(int j=i+1;j<s.length;j++) {
			   if(s[i].compareTo(s[j])>0) {
				   yedek=s[i];
				   s[i]=s[j];
				   s[j]=yedek;
			   }
		   }
		   
	   }
	   for(int i=0;i<s.length;i++) {
		   System.out.println(i + ".sırada:"+ s[i]);
	   }
   }
}
