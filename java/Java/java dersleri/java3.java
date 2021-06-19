package bütünleme;
import java.util.*;
public class java3 {

	
	
	public static int islem(int a,int b) {
		
		return a/b;
	}
	
	public static void main(String argc[]) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Pay giriniz");
		int numerator=scanner.nextInt();
		System.out.println("Payda giriniz");
		int denominator=scanner.nextInt();
		
   int result=islem(numerator,denominator);
   System.out.printf("Result: %d %d %d", numerator,denominator,result);
	}
	
	// paydaya sıfır verince ArithmeticException olur..
			

}
