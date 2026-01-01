package main_programs;
import java.util.Scanner;
public class primeNum {
      public static boolean isprime(int n) {
    	  int count=0;
    	  if(n>0) {
    		  for(int i=1;i<=n;i++) {
    			  if(n%i==0) {
    				  count++;
    			  }
    		  }
    		  if(count>2) {
    			  return false;
    		  }
    		  else {
    			  return true;
    		  }
    	  }
    	  else {
    		  return false;
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sr=new Scanner(System.in);
      System.out.println("enter the number:");
      int no=sr.nextInt();
      System.out.println("the entered number isPrime= "+isprime(no));
	}

}
