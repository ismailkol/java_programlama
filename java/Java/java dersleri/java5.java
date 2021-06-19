package bütünleme;

public class ch11_3 {

	public static void main(String argc[]) {
		
		try {
			method1();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void method1()
	throws Exception
	{
		try {
			method2();
		}
		catch(Exception e) {
			throw new Exception("Exception",e);
		}
	}
	public static void method2()
	throws Exception
	{
		throw new Exception("Exception");
	}
}
