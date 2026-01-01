package main_programs;
import java.util.Scanner;
public class palindromeChecker {
    public String isPalin(int palinValue) {
    	int originalValue=palinValue;
    	int n=palinValue;
    	int rev=0;
    	while(n>0) {
    		int r=n%10;
    		rev=rev*10+r;
    		n/=10;
    	}
    	if(rev==originalValue) return "yes";
    	else return "no";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeChecker on=new palindromeChecker();
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the input");
		int palinvalue=sr.nextInt();
		System.out.println("is it palindrome"+(on.isPalin(palinvalue)));
	}

}
