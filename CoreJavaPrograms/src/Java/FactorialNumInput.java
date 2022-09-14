package Java;

import java.util.Scanner;

public class FactorialNumInput {

	static int factNum(int num) {
		if(num==1||num==0) {
			return 1;
		}else return num*factNum(num-1);
	}
	public static void main(String []args) {
	
		System.out.println("Enter any number to find factorial: ");
		Scanner sc= new Scanner(System.in);
		int input= sc.nextInt();
		System.out.println("The factorial of "+input+" is: "+factNum(input));
		
		
	}
}
