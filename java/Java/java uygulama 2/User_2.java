package deneme2;
import java.lang.*;

public class User {
private int id;
private String name;

public User (int id , String name) {
	this.id=id;
	this.name=name;
			
}
public User() {
System.out.printf("Parametresiz yapıcı fonksiyon");
}
//bu yöntem ile nesne yaratılır.
public void addUser(int id, String name) {
	User user1=new User();
	user1.id=id;
	user1.name=name;
	
	Job job1=new Job();
	job1.salary=(int)id;
	job1.title=name;
	
	
}
}
//halka acık olmayan sınıf
class Job{
	String title;
	double salary;
}
//birden fazla halka açık olmayan sınıf olabilir.
class Car{
	String regNo;
	String model;
	String colour;
	
	public static void main(String args[]) {
		User deneme=new User();
		deneme.addUser(100, "ismail");
	}
}
