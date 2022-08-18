package Java;
import java.lang.*;
import java.util.*;
public class ExceptionArgument {

	int sum(int[] values) {
		int i,sum=0;
		int arrLenght=values.length;//Array length
		//Illegal Argument Exception
		try {
			if(values.length==0) throw new IllegalArgumentException();
			
		}catch(IllegalArgumentException e) {
			System.out.println("Oops! Illegal Argument");
			return 0;
		}
		
		//Null Pointer Exception
		try {
			for(i=0;i<arrLenght;i++) {
				sum+=values[i];
			}
			
		}catch(NullPointerException e) {
			System.out.println("Oops! The array is null");
			return 0;
		}
		
		
		//
		
		
		for(i=0;i<arrLenght;i++) {
			sum+=values[i];
		}
	
		return sum;
	}
	public static void main(String args[]) {
		int []arr= {1,4,3,2};
		ExceptionArgument obj= new ExceptionArgument();
		obj.sum(arr);
		
	}
}
