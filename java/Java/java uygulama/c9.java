package javacalisma;

public class c9 {
public static void main(String args[] ) {
	int liste[]=new int [5];
	liste[0]=1;
	liste[1]=2;
	liste[2]=3;
	liste[3]=4;
	liste[4]=5;
	
	int liste2[]= {1,2,3,4,5};
	System.out.println(liste2[2]);
	ders d1 =new ders ("java","iso",10);
	ders d2 =new ders ("c#","iso",10);
	ders d3 =new ders ("c++","iso",10);
	ders dersliste[]= {d1,d2,d3};
	System.out.println(d1.dersAdi);
	
}
}
