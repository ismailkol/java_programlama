package deneme2;
import java.awt.*;
import java.applet.*;
import java.lang.ClassNotFoundException;
public class cizim extends Applet {
public void init() {
	
}
	public void paint(Graphics Ekran) {
		kare k=new kare(Ekran,50,50,50);
		daire d=new daire(Ekran,100,100,50);
	}
}
