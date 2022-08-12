package Java;

public class RemoveWhiteSpace {

	public static void main(String args[]) {
	 String str1="Hello world !";    
     
     //Removes the white spaces using regex    
     str1 = str1.replaceAll("\\s+", "");    
         
     System.out.println("After removing white spaces : " + str1);    
}
}
