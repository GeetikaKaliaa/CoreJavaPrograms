package Java;

public class CountCharString {
     String str;
     static int count=0;
     
     //Static method to count str leng
     // logic : Total length-number of spaces
     static void strCount(String str) {
    	 str=str;
    	 int i,len=str.length();
    	 for(i=0;i<len;i++) {
    		 if(str.charAt(i)==' ') count++;
    		 }
    	 System.out.println("The number of character in "+str+" is: "+ (len-count));
     }
     
	public static void main(String args[]) {
		String str1= "Hello world";
		strCount(str1);  
	}
}
