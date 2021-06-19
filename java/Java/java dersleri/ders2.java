package bütünleme;

public class ders2 {
    public static long factoriel(long a) {
    	if(a<=1) {
    		return 1;
    	}
    	else {
    		return a*factoriel(a-1);
    	}
    }
	


	public static void main(String argc[]) {
		for(int i=0;i<10;i++) {
			System.out.println(i+" "+factoriel(i));
		}
		
	}
}
