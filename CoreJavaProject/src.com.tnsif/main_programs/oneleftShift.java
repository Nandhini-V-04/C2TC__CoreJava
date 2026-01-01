package main_programs;
import java.util.*;
public class oneleftShift {
      public int[] oneshift(int ar[]){
    	  int temp=ar[0];
    	  for(int i=1;i<ar.length-2;i++) {
    		  ar[i-1]=ar[i];
    	  }
    	  ar[ar.length-1]=temp;
    	  return ar;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      oneleftShift obj=new oneleftShift();
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the size of the array:");
      int size=sc.nextInt();
      int[] ar=new int[size];
      System.out.println("enter the value to enter into arr");
      for(int i=0;i<ar.length;i++) {
    	  ar[i]=sc.nextInt();
      }
      System.out.println("the array after left shifted by using 1 position");
      int shiftarr[]=obj.oneshift(ar);
      for(int store:shiftarr) {
    	  System.out.println(store);
      }
	}

}
