package bütünleme;
import java.util.*;
public class Üçüncü_Bölüm_8 {
    public static void main(String argc[]) {
    	
    	System.out.println("Üst giriniz:");
    	Scanner input1=new Scanner(System.in);
    	int üst=input1.nextInt();
    	System.out.println("Taban giriniz:");
    	Scanner input2=new Scanner(System.in);
    	int taban=input2.nextInt();
    	System.out.println(Math.pow(taban, üst));
    }
}
