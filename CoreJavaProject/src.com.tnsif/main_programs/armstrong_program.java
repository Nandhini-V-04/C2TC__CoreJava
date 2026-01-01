package main_programs;
import java.util.Scanner;
public class armstrong_program {
     boolean isarms(int no,int digit) {
    	 int original=no;
    	 int sum=0;
    	    	 while(no>0) {
    		 int lastdigit=no%10;
    		 sum=sum+(int)Math.pow(lastdigit,digit);
    		  no=no/10;
    	 }
    	    	 if(original==sum) {
    	 return true;
     }else {
    	 return false;
     }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong_program obj=new armstrong_program();
        Scanner sr=new Scanner(System.in);
        System.out.print("enter the number to check:");
        int num=sr.nextInt();
        int digit=0;
        int num1=num;
        while(num>0) {
   		 num=num/10;
   		 digit++;
        }
        System.out.println("number of digit:"+digit);
        System.out.println("Is Armstrong Number: "+obj.isarms(num1,digit));
	}

}
