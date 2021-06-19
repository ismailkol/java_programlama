package bütünleme;

public class ch16_1 {

	
	public static void main(String argc[]) {
		char [] charArray= {'i','s','m','a','i','l','k','o','l'};
		String s=new String("hello");
		String s1=new String();
		String s2=new String(s);
		String s3=new String(charArray);
		//6 indexden 3 ilerisini alır..
		// hatalı yazılır 
		String s4=new String(charArray,6,5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
