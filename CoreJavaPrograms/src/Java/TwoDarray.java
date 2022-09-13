package Java;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String []args) {
		String[] arrName= {"Peter" , "Amy", "John" ,"Boyd","Cathy"};
		Integer[] arrInt= {15,9,14,10,12};
		
		Arrays.sort(arrName);
		String str = Arrays.toString(arrName);
		System.out.println(str);
		
		Arrays.sort(arrInt);
		String str1 = Arrays.toString(arrInt);
		System.out.println(str1);
		System.out.println("Name"+"      "+"Value");
		for(int i=0;i<5;i++) {
			System.out.println(arrName[i]+"        "+arrInt[i]);
		}
	}
}
