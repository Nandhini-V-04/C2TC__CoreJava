package main_programs;
import java.util.Scanner;
public class CountDigit {
     public static int FindcountDigits(int number) {
    	 int n=number;//n=12
    	 int count=0;
    	 while(n>0) {
    		 int digit=n%10;//12%10=2
    		 n=n/10;//12/10=1
    		 if(digit !=10&&number%digit==0) {
    			 count++;
    		 }
    	 }
    	 return count;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sr=new Scanner(System.in);
      System.out.println("enter the number to find the countDigit:");
      int number=sr.nextInt();
      System.out.println(FindcountDigits(number));
	}

}
