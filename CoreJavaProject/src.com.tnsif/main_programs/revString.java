package main_programs;
import java.util.*;
public class revString {
     public String strRev(String rev,int l,String st) {
    
    	 for(int i=l-1;i>=0;i--) {
    		  rev=rev+st.charAt(i);
    	 }
    	 return rev;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      revString ob=new revString();
      Scanner sr=new Scanner(System.in);
      System.out.print("enter the String:");
      String college=sr.nextLine();
      String rev=null;
      int strLen=college.length();
      String RESULT=ob.strRev(rev,strLen,college);
      System.out.println("the reversed String is"+RESULT);
	}

}
