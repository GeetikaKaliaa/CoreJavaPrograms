package multithreading;

import java.io.*;

public class Fibonacci extends Thread {
	public void run()
    {
         try
         {
              int a=0, b=1, c=0;
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

              System.out.print("Enter the nth position of fabonacci: ");

              int n = Integer.parseInt(br.readLine());
              System.out.println("\n*************");
              System.out.println("Fibonacci series=");
              while (n>0)
              {
                   System.out.print(c+" ");
                   a=b;
                   b=c;
                   c=a+b;
                   n=n-1;
              }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }
	

}
