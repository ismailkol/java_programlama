package javacalisma;
import java.util.EnumSet;

public class c15 {
	public static void main(String args[]){
	
		System.out.println("Türk eğitim sistemi");
		for(egitim okullar:egitim.values()) {
			System.out.println(okullar.toString());
		}
		System.out.println("Türk sisteminde meb bağlı olanlar");
		for(egitim okullar:EnumSet.range(egitim.ilkokul,egitim.lise)) {
			System.out.println(okullar.toString());
		}
		System.out.println("Türk sisteminde yok bağlı olanlar");
		for(egitim okullar:EnumSet.range(egitim.lisans,egitim.doktora)) {
			System.out.println(okullar.toString());
		}
	}

}
