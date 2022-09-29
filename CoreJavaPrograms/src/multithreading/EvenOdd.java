package multithreading;
import java.util.*;

public class EvenOdd {
boolean odd;
int count=1;
int max;

public void printOddNum() {
	synchronized(this) {
		while(count<max) {
			System.out.println("call for odd numbers: ");
			while(!odd) {
				try {
					System.out.println("Odd Waiting: "+count);
					wait();
					System.out.println("Notified odd :" + count);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Odd Thread :" + count);  
             
            count++;  
              
            odd = false;  
			notify();
			}
	}
}

public void printEvenNum() {
	try {
		Thread.sleep(500);
	}catch(InterruptedException e1) {
		e1.printStackTrace();
	}
	synchronized(this) {
		System.out.println("call for even numbers: ");
		while(odd) {
			try {
				System.out.println("Even wait: "+ count);
				wait();
				System.out.println("notified"+count);
			
			
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even Thread: "+count);
		count++;
		notify();
}
}

public static void main(String[] args) {
	final EvenOdd obj= new EvenOdd();
	obj.odd = true;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter maximum value");
	obj.max= sc.nextInt();
	sc.close();
	Thread thread1= new Thread(new Runnable() {
		@Override
		public void run() {
			obj.printEvenNum();
		}
	});
	Thread thread2=new Thread(new Runnable() {
		@Override
		public void run() {
			obj.printOddNum() ;
		}
	});
	
	thread1.start();
	thread2.start();
	try {  
        thread1.join();  
        thread2.join();  
    } catch (InterruptedException e) {  
        // handle exception  
        e.printStackTrace();  
    }  
} 
}

