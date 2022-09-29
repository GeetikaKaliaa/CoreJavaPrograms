package multithreading;

public class FiboRevThread {
   
	public static void main(String args[]) {
		
		try
        {
             Fibonacci fibo = new Fibonacci();
             fibo.start();
             fibo.sleep(4000);
             Reverse rev = new Reverse();
             rev.start();
        }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
		
	}
}
