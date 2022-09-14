
package Java;

class OopsStudent {
    public static void main(String args[]) {
    	System.out.println("Institute Name         Name    Rollno   Age    ");
    	System.out.println("   ");
    	
    	//Student 1
    	Student s1= new Student();
    	s1.set_info("Rohan", 19, 17);
    	System.out.println(s1.toString());
    	
    	//Student 2
    	Student s2= new Student();
    	s2.set_info("Mohan", 20, 16);
    	System.out.println(s2.toString());

    	
    	//Student 3
    	Student s3= new Student();
    	s3.set_info("Sohan", 21, 15);
    	System.out.println(s3.toString());

    	
    	
    }
}

class Student{
	final String InstituteName="Annudip Foundation";
	    private String name;
	    private int rollno;
	    private int age;
	    
	Student(){
	    }
	    
	    void set_info(String name, int rollno,int age) {
	    	this.name=name;
	    	this.rollno=rollno;
	    	this.age=age;
	    }
	    
//	    void get_info() {
//    	
//    	System.out.println(name+"    "+rollno+"      "+age);
//    	
//    }
	    
	    //return a self-descriptive String
	    public  String toString() {
	   	 return InstituteName+"     "+name+"       "+rollno+"       "+age;
	    }
}