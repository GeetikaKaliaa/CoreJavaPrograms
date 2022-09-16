package CollectionProjects;

import java.util.ArrayList;

 
public class BookList  {

	public static void main(String args[]) {
		
		ArrayList<Book> list1= new ArrayList<>();
		Book ob1=new Book(2000, "Java", "Oracle");
		
		
		Book ob2=new Book(300, "Java", "W3Schools");
		
		
		Book ob3=new Book(1000, "Java", "Grayscale ");
		System.out.println("List 1");
		
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		for (Book ob: list1) {
		    System.out.println(ob);
		}
		
		ArrayList<Book> list2= new ArrayList<>();
		Book ob4=new Book(2500, "C++", "Ulla Kirch-Prinz");
		
		
		Book ob5=new Book(1500, "C++", "Michael Dawson");
		
		
		Book ob6=new Book(1100, "C++", "Stanley");
		
		System.out.println("List 2");
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		
		for (Book ob: list2) {
		    System.out.println(ob);
		}
		
		
		
	    
	}
}


