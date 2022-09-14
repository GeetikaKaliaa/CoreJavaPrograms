package Java;

import java.util.Scanner;

public class CountCharFromString {
static int countChar(String str) {
	int n=0,i,len=str.length(),count=0;
	for(i=0;i<len;i++) {
		if(str.charAt(i)==' ') count++;  //count increase when char encounters a space
	}
	
	return len-count; // minus no. of spaces from string length
}
	public static void main(String []args) {
		System.out.println("Enter any paragraph: ");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("The number of character excluding spaces: "+countChar(str));
		}
}
