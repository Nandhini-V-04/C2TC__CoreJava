package main_programs;
import java.util.Scanner;
public class lastDigit {
	public int LastDigit(int n) {
		return n%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lastDigit ob=new lastDigit();
		System.out.print("enter the number:");
    Scanner sr=new Scanner(System.in);
    int no=sr.nextInt();
    System.out.println("the last digit is"+(ob.LastDigit(no)));
    
    
	}

}
