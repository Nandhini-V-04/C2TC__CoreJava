package main_programs;
import java.util.Scanner;
public class reverseNumber {
     public int reverseNo(int num) {
    	 int rev=0;
    	 while(num!=0) {
    		int r=num%10;
    		rev=rev*10+r;
    		num=num/10;
    	 }
    		return rev;
    	 }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber obj=new reverseNumber();
      Scanner sr=new Scanner(System.in);
      System.out.println("enter the number to reverse the values:");
      int n=sr.nextInt();
      System.out.println("the reverse number is "+(obj.reverseNo(n)));
	}

}
