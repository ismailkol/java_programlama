package deneme2;
import java.util.*;
public class dizi {
	
	public static void main(String args[]) {
int [] CiftSayilar=new int[10];
for(int i=0;i<10;i++) {
	CiftSayilar[i]=i*2;
}
for(int i=0;i<CiftSayilar.length;i++) {
	//System.out.println(CiftSayilar[i]+"\n");
	
	
}
int [] dizi=new int[0];
//javada 0 elamanlı dizi tanımlanabilir.
//bu tip dizinin kullanım yeri dönüş tipi dizi olan bir metot boş deger döndüreceginde kullanılır.

int [ ] dizi2=CiftSayilar;
// dizi kopyalama işlemidir.
dizi2[0]=53;
for(int i=0;i<dizi2.length;i++) {
	System.out.println(dizi2[i]);
}
int []asalSayilar= {2,3,5,7,11,13};
int []SansliSayilar= {1001,1002,1003,1004};
System.arraycopy(asalSayilar, 0, SansliSayilar, 0, 4);
//System.arraycopy(HangiDiziden, kaynakBaslangicSirasi, HangiDiziye, hedefBaslangicSirasi, kacTane);


for(int i=0;i<SansliSayilar.length;i++) {
	System.out.println(i+":"+SansliSayilar[i]);
}
int [] dizi3= {1,4,5,2,7,5};
Arrays.parallelSort(dizi3);
//diziyi küçükten büyüge sıralar.
for(int i=0;i<dizi3.length;i++) {
	System.out.println(dizi3[i]);
}
//Listenin içinde varmi diye kontrol eder.
int a=Arrays.binarySearch(dizi3, 2);
System.out.println(a);
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] aramaDizisi=new int[n];
Random rand=new Random();
int m=rand.nextInt(50);
//dizini içini doldurmak için kullanılır.
Arrays.fill(aramaDizisi, m);
for(int i=0;i<aramaDizisi.length;i++) {
	System.out.println(aramaDizisi[i]);
}

//dizileri karşılaştırmak
int [] dizi4= {1,3,5,7,9};
int [] dizi5= {2,4,6,8,0,7};
Arrays.equals(dizi4, dizi5);
System.out.println(Arrays.equals(dizi4, dizi5));

int dizi4Uzunluk=dizi4.length;
int dizi5Uzunluk=dizi5.length;
if (dizi4Uzunluk>=dizi5Uzunluk) {
	for(int i=0;i<dizi5.length;i++) {
		if(dizi4[i]==dizi5[i]) {
			System.out.println(i+" "+"True");
		}
		else System.out.println(i+" "+"False");
	}
}
else {
	for(int i=0;i<dizi4.length;i++) {
		if(dizi4[i]==dizi5[i]) {
			System.out.println(i+" "+"True");
		}
		else System.out.println(i+" "+"False");
	}
}
int [][] tablo={{1,2,3},{3,4,5},{5,6,7}};
int [][] tablo2=new int[3][3];
//javada gerçekte bütün diziler tek boyutludur,iki boyutlu bir dizi tanımlarsanız 
//bu bellekte tek boyutlu olarak görünür.
int []temp =tablo[2];
tablo[2]=tablo[1];
tablo[1]=temp;
for(int i=0;i<tablo.length;i++) {
	for(int j=0;j<tablo.length;j++) {
		System.out.println(i+" "+j+" "+tablo[i][j]);
	}
}

















}
}