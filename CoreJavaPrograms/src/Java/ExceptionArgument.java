package Java;
import java.lang.*;

import java.util.*;
public class ExceptionArgument {

	static int sum(int[] values,int start,int end) throws NullPointerException {
		int i,sum=0;
		
			for(i=start;i<=end;i++)
				sum+=values[i];
		try {
			if(sum==0) throw new Exception();
			if(values==null)throw new NullPointerException();
			System.out.println("The sum is: "+sum);
		}catch(Exception e) {
			System.out.println("Oops! Exception as sum is 0");
		}
		
		
		return sum;
		}
	
	//Enter elements in an array
	static int []arr;
	static int maxElem=10; //maximum number of elements to be stored in an array 
	
	
	static int[] arrayCreate(int n) {
		arr=new int[n];
		int i;
		try {
			
			if(arr.length==0) throw new IllegalArgumentException();
			if(n>maxElem) throw new ArrayIndexOutOfBoundsException();
			System.out.println("Enter the array elements: ");
		    for(i=0;i<n;i++) {
		    	
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
			
			
				//Here we make the pointer null when user entered 0
				if(arr[i]==0) {
					arr=null;
				  return arr;
				}
					
		  	
		    }
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ooops! Array index bound ArrayIndexBoundsException");
		}catch(IllegalArgumentException e) {
			System.out.println("Ooops! Array is empty IllegalArgumentException");
		}
		return arr;
	}
	//Show array elements
	static int[] arrayShow() {
		int i;
		int len= arr.length;
			System.out.print(" The array elements are:");
			if(arr==null) return null;
			for(i=0;i<len;i++) {
				System.out.print(" "+arr[i]+" ");
				}
			return arr;
		
		}
	
public static void main(String args[]) {
		System.out.println("Maximum element to be stored in an array is 10");
		System.out.println("Enter the number of elements in an array: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		
		
		arrayCreate(n);
		System.out.println(" ");
		int[] arr1 = null;
		
		
		
		try {
            
			if(n>10) throw new Exception(); //If input of number of elements more than 10 , throw exception.
//			 if(n==0) throw new Exception();
			arr1=arrayShow(); 
			
			 System.out.println();
			 
			    System.out.println("Enter the start position to sum 0 to 10: ");
				Scanner scS= new Scanner(System.in);
				int start=scS.nextInt();
				
				System.out.println("Enter the end position to sum  0 to 10: ");
				Scanner scE= new Scanner(System.in);
				int end= scS.nextInt();
				
//				Sum of number of elements
			 sum(arr1,start,end);
		}
		catch(Exception e) {
			System.out.println();
		}
		
		
		
	}
}
