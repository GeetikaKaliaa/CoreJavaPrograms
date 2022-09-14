package Java;

import java.util.Scanner;

public class TableOfN {
static void table(int n) {
	int i;
	for(i=1;i<=10;i++) {
		System.out.println(n+" * "+i+" = "+n*i);
	}
}
	public static void main(String[] args) {
		System.out.println("Enter any number to finds its multiple: ");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("Table of "+num);
		table(num);
	}
}
