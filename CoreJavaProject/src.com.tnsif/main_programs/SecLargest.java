package main_programs;
import java.util.Scanner;
import java.util.Arrays;
public class SecLargest {
    public int SecLge(int[]nan){
    	int SecLarg=-1;
    	int large=nan[0];
    	for(int i=1;i<nan.length;i++) {
    		if(nan[i]>large) {
    			SecLarg=large;
    			large=nan[i];
    		}
    		else if(nan[i]!=large && nan[i]>SecLarg) {
    			SecLarg=nan[i];
    		}
    	}
    		return SecLarg;
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SecLargest ob=new SecLargest();
    Scanner sr=new Scanner(System.in);
    System.out.println("Enter the Array Size:");
    int size=sr.nextInt();
    int[] nan=new int[size];
    for(int i=0;i<nan.length;i++) {
    	nan[i]=sr.nextInt();
    	    }
    //System.out.println("the Second Largest number in the array is"+ob.SecLarge(nan));
    System.out.println("the length of the array is:"+nan.length);
    System.out.println("the given array is:");
     for(int store:nan) {
   	System.out.print("  "+store);}
    System.out.println();
   System.out.println("the Second Largest number in the array is"+ob.SecLge(nan));
	}

}
