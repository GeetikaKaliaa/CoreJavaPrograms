package Java;
import java.util.*;

//Write a method that takes a String and returns a String of the
//same length containing the 'X' character in all positions except the
//last 4 positions. The characters in the last 4 positions must be the
//same as in the original string. For example, if the argument is
//"12345678", the return value should be "XXXX5678".


public class StringReturn {
	//String return method
	static String rtnSting(String str) {
		String st=str;
		int lenHalf=(st.length()/2),i,j; 
		
        System.out.println(lenHalf);
//		last 4digits of string in reverse order
		char [] last4Str= new char[4];
		//only for no. of digits 8 & 10 
		if(str.length()%2==0) {//when str length is even
			if(lenHalf%2==0) { //when length half is even
				for(i=st.length()-1,j=0;i>=(st.length()-lenHalf);i--,j++) {
					last4Str[j]=st.charAt(i);
					
				}
			}else { //when length half is odd
				for(i=st.length()-1,j=0;i>(st.length()-lenHalf);i--,j++) {
					last4Str[j]=st.charAt(i);
					
				}
			}
				
		}
		


		
		//to char array  into string
		String newStr=String.valueOf(last4Str);
		System.out.println("The reverse last 4 dig"+newStr);
		//to reverse the char array
		char[] revLastStr= new char[4];
		for(i=0,j=4;i<4;i++,j--) {
			revLastStr[j-1]=last4Str[i];
		}
		String newStr2=String.valueOf(revLastStr);
		System.out.println("The exact last 4 is "+newStr2);	
		
		
		
		char [] array=new char[str.length()-4];
		Arrays.fill(array, 'X');
		String newStr1=String.valueOf(array);  //convrt char array to string
		System.out.println("The number is "+newStr1 );
			
		String ResStr= newStr1.concat(newStr2);	
		
		
		System.out.println("The Result is  "+ResStr);
		return st;
	}

public static void main(String []args) {
	System.out.println("Enter any String number: ");
	Scanner sc=new Scanner(System.in);
	String stNum= sc.nextLine();
	
	rtnSting(stNum);
	
}
}
