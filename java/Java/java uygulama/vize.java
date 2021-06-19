package javacalisma;

public class vize {
	
	int  x=4;
		
		public vize(){
			x=1;
		}
		public vize(vize k) {
			k.x=2;
		}
		public void k() {
			x=3;
			vize k=new vize(this);
			System.out.print(x+"  "+k.x);
			
		}
		

	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new vize().k();

	}

}
