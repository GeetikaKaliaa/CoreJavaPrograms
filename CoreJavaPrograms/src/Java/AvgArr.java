package Java;
//Author:Geetika Kalia
//Program: Average of Array elements
public class AvgArr {
    int[] arr; 
    int avg=0;

    //Average Method
    
	void avg(int[] arr) {
		this.arr=arr;
		int i;
		int len=arr.length;
		
		for(i=0;i<len;i++) {
			avg+=arr[i];
		}
		int c= avg/len;
		System.out.println("The average of array is: "+c);
	}
	
public static void main(String args[]) {
	
	int[] arr1= {2,34,3,22,45,60};
	AvgArr obj= new AvgArr();
	obj.avg(arr1);
}
}
