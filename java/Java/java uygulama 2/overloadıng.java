package deneme2;

public class overloadıng {
int x;
int y;
String name;
public overloadıng() {
	this.x=0;
	this.y=0;
	this.name="Boş";
	System.out.println("Parametresiz yapıcı fonksiyon çağrıldı");
	
}
public overloadıng(int a,int b,String name) {
	this.x=a;
	this.y=b;
	this.name=name;
	
}
void topla() {
	System.out.print("deger mi verdun tirrek\n");
}
void topla(int a) {
	System.out.println(a+"\n");
	
}
void topla (int a,int b) {
	System.out.println(a+b+"\n");
	
}
public static void main(String args[]) {
 overloadıng d1=new overloadıng();
 int a=5;
 int b=6;
 d1.topla();
 d1.topla(a);
 d1.topla(a, b);
}













}
