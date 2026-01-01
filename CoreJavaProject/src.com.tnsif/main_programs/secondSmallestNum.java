package main_programs;
import java.util.Scanner;
import java.util.Arrays;
public class secondSmallestNum {
      public int sSmallest(int[]arr) {
    	  int sSmall=100;
    	  int small=arr[0];
    	  for(int i=1;i<arr.length-1;i++) {
    		  if(arr[i]<small) {
    			  sSmall=small;
    			  small=arr[i];
    		  }
    		  else if(arr[i]!=small&&arr[i]<sSmall) {
    			  sSmall=arr[i];
    		  }
    		  
    	  }
    	  System.out.println("smallest value is"+small);
    	  return sSmall;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondSmallestNum ob= new secondSmallestNum();
      Scanner sr=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int arr_size=sr.nextInt();
       		int[] arr=new int[arr_size];
       		for(int i=0;i<arr.length-1;i++) {
       			arr[i]=sr.nextInt();
       		}
       		for(int store:arr) {
       			System.out.print(store);
       		}
       System.out.println("the second Smallest No"+ob.sSmallest(arr));
    		  }

}
