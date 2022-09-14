package Java;

import java.util.Scanner;

public class OopsShape {
public static void main(String []args) {
	System.out.println("Enter the side : ");
	
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	Square1 objSq= new Square1();
	System.out.println("The area of square of side "+n+" is : "+objSq.area(n));
	
	
	System.out.println("Enter the length and breadth : ");
	
	Scanner scR= new Scanner(System.in);
	int nL= sc.nextInt();
	
	int nB= sc.nextInt();
	
	Rectangle1 objRec= new Rectangle1();
	System.out.println("The area of Rectangle of length "+nL+" & breadth "+nB+" is : "+objRec.area(nL,nB));
	
}
}
interface Shape1{

	abstract int area(int s);
}

class Square1 implements Shape1{
	int side;
//	Square(int side){
//		this.side=side;
//	}
	@Override
	public
	int area(int s){
		return s*s;
	}
}
class Rectangle1 extends Square1{
int width;
//	Rectangle(int side,int width) {
public
	int area(int s,int width){
		this.width=width;
		return s*width;
	}
	
	
}
