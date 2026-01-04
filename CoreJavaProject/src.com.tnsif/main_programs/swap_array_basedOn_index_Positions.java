package main_programs;

import java.util.Arrays;
import java.util.Scanner;

public class swap_array_basedOn_index_Positions {
    
	void swap(int[] ar,int position1,int position2) {
		int temp=ar[position1];
		ar[position1]=ar[position2];
		ar[position2]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap_array_basedOn_index_Positions ob=new swap_array_basedOn_index_Positions();
		Scanner sr=new Scanner(System.in);
		System.out.println("1 index:");
		int position1=sr.nextInt();
		System.out.println("2 index:");
		int position2=sr.nextInt();
		int[] ar= {10,20,30,40,50,60};
		System.out.println("ARRAY BEFORE PERFORMIMG SWAPPING OPERATION:"+Arrays.toString(ar));

		ob.swap(ar,position1,position2);
		System.out.println("ARRAY AFTER PERFORMIMG SWAPPING OPERATION:"+Arrays.toString(ar));

	}

}
