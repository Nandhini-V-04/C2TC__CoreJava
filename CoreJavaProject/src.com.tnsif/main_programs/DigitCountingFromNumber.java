package main_programs;
import java.util.Scanner; 
public class DigitCountingFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sr=new Scanner(System.in);
         System.out.print("enter the number");
         int number=sr.nextInt();
         int num=number;
         System.out.print("enter the digit to find the count of that given digit apperence in the number");
         int digit=sr.nextInt();   
         int count=0;
         while(number>0) {
        	 int lastDigit=number%10;
        	 if(lastDigit==digit) {
        		 count++;
        	 }
        	 number=number/10;
         }
	
	System.out.println(count+"times the given digit"+digit+"appears in the number"+num);

}
}
