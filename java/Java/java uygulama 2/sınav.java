package deneme2;

public class sınav {
Object a,b;
public sınav(Object a, Object b) {
	this.a=a;
	this.b=b;
	
}
public Object eval() {
	int n;
	if(a instanceof sınav) {
		a=((sınav)a).eval();
	}
	n=((Integer)a).intValue();
	if(b instanceof sınav) {
		b=((sınav)b).eval();
		}
	n -=((Integer)b).intValue();
	return new Integer(n);
}
}
