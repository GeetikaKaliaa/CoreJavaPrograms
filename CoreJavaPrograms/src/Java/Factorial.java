package Java;
import java.util.*;

public class Factorial {
    int n;
    //Factorial method by using recursion
    int fact(int n) {
    	if(n==0) return 1;
    	else return (n*fact(n-1));
    }
	
	public static void main(String args[]) {
		System.out.println("Factorial of a number: ");
		
		//Taking user input
		Scanner sc= new Scanner(System.in);
		int c= sc.nextInt();
		
		//Object of a class
		
		Factorial obj= new Factorial();
		int fac=obj.fact(c);
		
		//Output
		System.out.println(" The factorial of "+ fac);
	}
}
