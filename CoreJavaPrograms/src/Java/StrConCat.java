package Java;
import java.util.*;
//Write a method that takes a String[] as an argument and returns
//a String containing the concatenation of all the strings in the
//input array. Invoke your method 3 times with different arguments. Make
//sure that your code handles the cases where the argument is null.
public class StrConCat {
      //Method to concat string array elements
	void stringConcat(String[] str) {
		String newStr=""; //to store result string 
		try {
			if(str!=null) {
				for(int i=0;i<str.length;i++) {
					newStr+=str[i]+""; //logic for concat
				}
				System.out.println("The string after concat is "+"' "+newStr+"'");
			}
			throw new Exception();
		}catch(Exception e) { System.out.print("array is null");}
		 //print
		
	}
	public static void main(String [] args) {
		String[] arrStr= {"hello ","who ","are ","you ","? "};
		String[] arrStr1= null;
//		String str1= Arrays.toString(arrStr);
//		System.out.println(str1);
		
		StrConCat obj= new StrConCat();
		obj.stringConcat(arrStr);
		
		StrConCat obj1= new StrConCat();
		obj1.stringConcat(arrStr1);
}
}
