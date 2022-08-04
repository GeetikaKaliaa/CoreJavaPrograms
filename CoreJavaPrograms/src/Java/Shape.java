package Java;

public class Shape {

	void prnt_shape() {
		System.out.println("This is Shape");
	}
	
public static void main(String args[]) {
	
	Square obj=new Square();
	obj.prnt_shape();
	obj.prnt_rectangle();	
	
}
}

class Rectangle extends Shape{
	void prnt_rectangle() {
		System.out.println("This is Rectangular Shape");
	}
}

class Square extends Rectangle{
	void prnt_square() {
		System.out.println("Square is Rectangle");
	}
}

class Circle extends Shape{
	void prnt_circle() {
		System.out.println("This is Circular Shape");
	}
}
