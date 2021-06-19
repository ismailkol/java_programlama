package javacalisma;
import java.util.Scanner;
//veri alma kütüphanesi
public class calısma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // System.out.println("hello");
        Scanner input = new Scanner (System.in);
        String yazi=input.nextLine();
        
        // string alma
        Scanner input2 = new Scanner (System.in);
        int sayi = input2.nextInt();
        //scanner ve var ayni işlemi ediyordur.
        //int alma
        Scanner input3= new Scanner (System.in);
        double sayi2=input3.nextDouble();
        System.out.println("hello");
        //double alma
        System.out.println(yazi);
        System.out.println(sayi);
        System.out.println(sayi2);
	}

}
