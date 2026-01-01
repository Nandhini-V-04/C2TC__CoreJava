package main_programs;
import java.util.Scanner;
public class shiftAllZerostoEnd {
     public int[] zeroShift(int arr[],int count) {
    	 int[] temp=new int[count];
    	 int index=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]!=0) {
    			 temp[index++]=arr[i];
    		 }
    		 
    	 }
    	 for(int i=0;i<count;i++) {
    		 arr[i]=temp[i];
    	 }
    	
    	 for(int i=count;i<arr.length;i++) {
    		 arr[i]=0;
    	 }
    	 return arr;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		shiftAllZerostoEnd obj =new shiftAllZerostoEnd();
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sr.nextInt();
		int[] ar=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the value for the index"+i);
			ar[i]=sr.nextInt();
		}
		System.out.print("the created array is:");
		for(int store:ar) {
			System.out.print(store);
			
		}
		for(int i=0;i<size;i++) {
			if(ar[i]!=0) {
				count++;
			}
		}
		int[] finalarr=obj.zeroShift(ar,count);
		System.out.println("array after shofted all the zero to end of the array: [ ");
		for(int st:finalarr) {
			System.out.print(st);
		}
		System.out.println(" ]");
	}

}
