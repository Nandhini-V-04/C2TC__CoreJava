package main_programs;

import java.util.Arrays;
import java.util.Scanner;
//variable type argument declaration mostly used whenever we don't know amount number input passed into the the function as a parameter or the arguments
//get store given number input passed to the function as a array internally.
//Systex: datatype ...v (example: int ...v)
public class variable_length_argments_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable_length_argments_example obj = new variable_length_argments_example();
		Scanner sr=new Scanner(System.in);
		obj.method1(2, 3, "nandhini","god","bless","you");
		obj.method2(66, 1,2,3,4,5,6,6,6,6,6);
	}
	//first function
    void method1(int a,int b,String ...v) { //store v values as a String array
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(Arrays.toString(v));
    }
    //second function
    void method2(int a,int ...d) {  //store d values as a integer array
    	System.out.println(a);
    	System.out.println(Arrays.toString(d));
    }
}
