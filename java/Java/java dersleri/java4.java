package bütünleme;
import java.util.InputMismatchException;
import java.util.*;
public class ch11_2 {
   public static int işlem(int a,int b) 
	   //aritmetik hatayı yakılıyor...
	   throws ArithmeticException{
	   {
		   return a/b;
	   }
   }
	
	
	
	public static void main(String argc[]) {
		Scanner scanner =new Scanner(System.in);
		boolean continueLoop=true;
		do {
			try {
				System.out.println("Pay giriniz");
				int pay=scanner.nextInt();
				System.out.println("Payda giriniz");
				int payda=scanner.nextInt();
				
				int sonuç=işlem(pay,payda);
				System.out.println(sonuç);
				continueLoop=false;
				
			}
			//kelime harf girince hata yakalıyor
			catch(InputMismatchException a) {
				System.err.printf("%s",a);
				//yeniden girmemizi sağlıyor..
				scanner.nextLine();
			}
			catch(ArithmeticException b) {
				System.err.printf("%s", b);
				
			}
		}while (continueLoop);
		
	}
}
