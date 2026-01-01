package main_programs;
import java.util.Scanner;
public class nested_switch {
      String ex_NestedSwitch(int rollNo, String dept) {
    	  String d=null;
    	  switch(rollNo) {
    	  case 1:{
    		  switch(dept) {
    		  case "it":{
    			  d= "your are from infomation Technology";
    			  break;}
    		  case "cse":{
    			  d= "your from computer science and engineering";
    			  break;}
    		 default:{
    			 d= "we cannot identify your department so please check your roll Number";}}
    		 break;
    	  }
    	  case 2:{
    		  d= "EEE department";
    		  break;}
    	default:{
    		d= "invalid rollnumber";
    	}
    	  }
    	  return d;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       nested_switch ob=new nested_switch();
       Scanner sr=new Scanner(System.in);
       System.out.print("enter the roll number:");
       int rollnumber=sr.nextInt();
       System.out.print("enter the department:");
       String department=sr.next();
       String result=ob.ex_NestedSwitch(rollnumber, department);
       System.out.println(result);
	}

}
