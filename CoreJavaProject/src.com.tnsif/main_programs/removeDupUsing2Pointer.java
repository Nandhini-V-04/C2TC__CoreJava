package main_programs;
import java.util.*;
public class removeDupUsing2Pointer {
   public int duprem(int n,int[]arr) {
	   int i=0;
	   for(int j=1;j<n;j++) {
		   if(arr[j]!=arr[i]) {//i=0 i=1...
			   arr[i+1]=arr[j];
			   i++; //i=1 //i=2 ......
		   }
	   }
	   return i+1;
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDupUsing2Pointer obj=new removeDupUsing2Pointer();
   int arr[]= {1,1,2,2,3,4,4,5,5,6};
   int n=arr.length;
   System.out.println("the length of the array after removal:"+obj.duprem(n,arr));
	}

}
