package bütünleme;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ders5 implements Runnable {

	private final int SleepTime;
	private final String taskname;
	private final static Random generator=new Random();
	
	public ders5(String name) {
		this.taskname=name;
		SleepTime=generator.nextInt(5000);
		
	}
	public void run() {
		try {
		System.out.printf("%s,%s",taskname,SleepTime);
		Thread.sleep(SleepTime);
	}
	   catch(InterruptedException e){
		   System.out.printf("%s", taskname);
	   }
	}
	public static void main(String argc[]) {
		
		ders5 deneme1=new ders5("deneme1");
		ders5 deneme2=new ders5("deneme2");
		ders5 deneme3=new ders5("deneme3");
		
		ExecutorService threadExecutor=Executors.newCachedThreadPool();
		threadExecutor.execute(deneme1);
		threadExecutor.execute(deneme2);
		threadExecutor.execute(deneme3);
		
		threadExecutor.shutdown();
		
	}


}
