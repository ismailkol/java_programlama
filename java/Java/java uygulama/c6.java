package javacalisma;
import java.util.Scanner;
public class calısma5 {
public static void main(String [] args) {
	System.out.println("Bir sayi giriniz");
	Scanner deger=new Scanner (System.in);
	int sayi=deger.nextInt();
switch(sayi) {
case(1):
	System.out.println("Bİr girdiniz");
    break;
case(2):
	System.out.println("İki girdiniz");
    break;
case(3):
	System.out.println("Üç girdiniz");
    break;
default:
	System.out.println("Üçten büyük sayı girdiniz");
	break;
}
}
}
