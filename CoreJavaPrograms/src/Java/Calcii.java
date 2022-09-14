package Java;

import java.util.Scanner;

public class Calcii {
public static void main(String []args) {
	System.out.println("Enter two numbers: ");
	
	try (Scanner sc1 = new Scanner(System.in)) {
		int n1=sc1.nextInt();
		try (Scanner sc2 = new Scanner(System.in)) {
			int n2=sc2.nextInt();
			try (Scanner sc3 = new Scanner(System.in)) {
				double n3=sc3.nextDouble();
				
				String s1="5";
				String s2="6";
				Calculator obj = new Calculator ();
				System.out.println("Addition of both int: "+n1+" + "+n2+" = " +obj.add(n1,n2)); //int add
				
				System.out.println("Addition of doble and both int: "+n3+" + "+n1+" + "+n2+" = " +obj.add(n3,n1,n2)); //double add
				
				System.out.println("Addition of oth string : "+s1+" + "+s2+" = " +obj.add(s1,s2)); // string add
				
				System.out.println("Subtraction both integer of: "+n1+" - "+n2+" = " +obj.substract(n1,n2));
				System.out.println("Subtraction both doubles of: "+n1+" - "+n2+" = " +obj.substract(n3,4.234));
			}
		}
	}
	
	
}
}
class Calculator{
	int n;
	
	    int add(int n1,int n2) {
		return n1+n2;
	    }
	   double add(double d1,int n1,int n2) {
		   return d1+n1+n2;
	   }
	   String add(String s1,String s2) {
		   return s1+s2;
	   }

	  int substract(int n1,int n2) {
		  return n1-n2;
	  }
	   double substract(double d1,double d2) {
		   return d1-d2;
	   }
}

