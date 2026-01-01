package main_programs;
import java.util.Scanner;
public class StringtogglePRo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sr=new Scanner(System.in);
    String result="";
    System.out.print("enter the String:");
    String str=sr.nextLine();
    System.out.println("the given input String is: "+str);
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	if(Character.isLowerCase(ch)) {
    		result=result+Character.toUpperCase(ch);
    	}
    	else if(Character.isUpperCase(ch)) {
    		result+=Character.toLowerCase(ch);
    	}else {
    		result+=ch;
    	}
    }
    System.out.println("the toggle of the given input is: "+result);
	}

}
