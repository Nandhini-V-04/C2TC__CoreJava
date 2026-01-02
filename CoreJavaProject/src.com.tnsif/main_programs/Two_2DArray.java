package main_programs;
import java.util.Arrays;
import java.util.Scanner;
public class Two_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sr=new Scanner(System.in);
     System.out.print("enter the seize of the array:");
     int size=sr.nextInt();
     int[][] ar= new int[size][];
      //for getting input from the user during runtime
      for(int row=0;row<ar.length;row++) {
    	  //run the columns row fully for each rows
    	  System.out.print("enter the size of the column:");
    	  int col=sr.nextInt();
    	  ar[row]=new int[col];// here we assign size for the each ar[row] to declare number columns in each row
    	  for( col=0;col<ar[row].length;col++) {
    		  ar[row][col]=sr.nextInt();
    	  }
      }
      //output (PRINTING ELEMENT IN THE ARRAY FOR OUTPUT DISPLAYING PURPOSE)
      for(int row=0;row<ar.length;row++) {
    	  for(int col=0;col<ar[row].length;col++) {
    		  System.out.print(ar[row][col]+"  ");
    		      	  }
    	  System.out.println();
      }
      //printing using toString method
      System.out.println("display elements using toString methods");
      for(int row=0;row<ar.length;row++) {
    	  System.out.println(Arrays.toString(ar[row]));
    	  
    	  System.out.println();
      }
      //printing using foreach loop
      System.out.println("printing using ForEach Loop");
      for(int[] a:ar) {
    	  System.out.println(Arrays.toString(a));
      }
      
      
	}

}
