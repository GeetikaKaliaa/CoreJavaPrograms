package Java;
//Program to remove duplicate elements in an array

public class RemDupElem {

	public static int removeDupElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
public static void main(String args[]) {
	
	 int arr[] = {1,2,3,2,1,3,4,5,8};  
     int length = arr.length;  
     length = removeDupElements(arr, length);  
     //printing array elements  
     for (int i=0; i<length; i++)  
        System.out.print(arr[i]+" ");  
     
}
}
