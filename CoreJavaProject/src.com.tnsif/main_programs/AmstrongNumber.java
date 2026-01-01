package main_programs;
import java.util.Scanner;
public class AmstrongNumber {
     public boolean isAmstrong(int n) {
    	 int sum=0,digit=0,temp;//if n=153
    	 temp=n;
    	 while(temp>0) {
    		 temp=temp/10;//1 iteration:15, 2nd iteration:1
    		 digit++;//1,2,3
    	 }
    	 //System.out.println("total number of digit is:"+digit);
    	 temp=n;
    	 while(temp>0) {
    		 int lastDigit=temp%10;
    		 sum=(int)(Math.pow(lastDigit, digit));    		 
    	 }
    	 if(sum==n) return true;
    	 else return false;
    	 }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     AmstrongNumber obj=new AmstrongNumber();
     System.out.println("enter the number to check whether the given number is Amstrong or not");
     int num=sc.nextInt();
    boolean res=obj.isAmstrong(num);
    System.out.println("is it Amstrong"+res);
	}

}
