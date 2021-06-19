package javacalisma;

public class c10 {
public static void main(String args[]) {
	int liste[][]= {{1,2,3},{4,5,6}};
	int liste2[][]= {{10,11},{12,13},{1,2}};
	goster(liste);
	goster(liste2);
}
public static void goster(int liste[][]) {
	for (int i=0;i<liste.length;i++) {
		for(int j=0;j<liste[i].length;j++) {
			System.out.printf(liste[i][j]+"\t");
		}
	}
		
}
}
