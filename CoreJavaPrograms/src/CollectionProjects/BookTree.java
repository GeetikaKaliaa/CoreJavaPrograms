package CollectionProjects;
import java.util.*;


public class BookTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Book> list1= new TreeSet<Book>();
	    Book ob1=new Book(2000, "Java", "Oracle");
		Book ob2=new Book(300, "Java", "W3Schools");
		Book ob3=new Book(1000, "Java", "Grayscale ");
		
		System.out.println("TreeSet 1");
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		 Iterator<Book> value = list1.iterator();
		  
	        // Displaying the values after iterating through the set
	        System.out.println("The iterator values are: ");
	        while (value.hasNext()) {
	            System.out.println(value.next());
	        }
			
	        System.out.println("\n First Element: "+list1.first()+ "\n Last Element: "+ list1.last());
	        
		TreeSet<Book> list2= new TreeSet<Book>();
        Book ob4=new Book(2500, "C++", "Ulla Kirch-Prinz");
		Book ob5=new Book(1500, "C++", "Michael Dawson");
		Book ob6=new Book(1100, "C++", "Stanley");
		
		System.out.println("TreeSet 2");
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		
		Iterator<Book> value2 = list2.iterator();
		 System.out.println("The iterator values are: ");
       while (value2.hasNext()) {
           System.out.println(value2.next());
       }
		
		System.out.println("\n First Element: "+list1.first()+ " \n Last Element: "+ list2.last());
	}

}