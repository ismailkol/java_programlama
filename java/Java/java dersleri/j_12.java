package bütünleme;

public class j_12 {
  //basit veri tipleri(boolea,byte,short,char,int,long,float ve double)
  //basit veri tipleri static olarak tanımlanır.
  //Bu değişkenler programın çalışma sürecince aktiftir.
  //Referans veri tipleride vardır bunlar RAM belleğin heap bölgesinde dinamik olarak
  // saklanırlar.Program çalışınca kullanılır ve işi bitince silinirler.
	
	/*
	boolean =true,false (1 byte)
	byte =-2^7,2^7-1(1 byte)
	char=(0(0x0000),2^16-1(0xFFFF) (2 byte)
	short=(-2^15,2^15-1) (2 byte)
	int=(-2^31,2^31) (4 byte) 
	long=(-2^63,2^63-1) (8 byte)
	float=(4 byte)(7-8 basamak duyarlı)
	double=(8 byte)(15-16 basamak duyarlı)
	
	 */
	
	public static void main(String argc[] ){
		
		int j;
		double a;
		for(int i=0;i<=10;i++) {
			j=i*i;
			System.out.println(i+". karasi= "+j);
		}
		for (int i=0;i<=10;i++) {
			a=Math.sqrt(i);
			System.out.print(i+". karakökü= "+a+"\n");
		}
		float f=1.4E9F;
		double h=1.4E6;
		//E ile kaç tane virgül kaydırılır onu söyleriz
		//F sonunda koymak ise float oldugunu temsil eder.
		
		System.out.println(f);
	}
}
