package main_programs;

import java.util.Arrays;

public class REVERSE_ARRAY_2POINTERS {
     static void reverse(int[] arr) {
    	 int start=0;//initially start point the first element of the array
    	 int end=arr[arr.length-1]; //end initially point the last element of the array
    	 while(start<end) {  //this loop execute until the start is less than end once the start greater tha  end the loop will be stop
    		 swap(arr,start,end);
    		 start++;
    		 end--;
    	 }
     }
     static void swap(int[] arr,int start,int end) {
    	 //here we perform swapping operation between the start and end whenever the swap method is called by reverse method
    	 arr[start]=arr[start]+arr[end];              //a=a+b
    	 arr[end]=arr[start]-arr[end];                //a=a-b;
    	 arr[start]=arr[start]-arr[end];              //a=a-b;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num= {1,2,3,4,5,6,7,7};
     System.out.println("Original array element"+Arrays.toString(num));
     reverse(num);
     System.out.println("Reversed Array Elements:"+Arrays.toString(num));
	}

}
