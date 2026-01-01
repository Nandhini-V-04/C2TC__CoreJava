package main_programs;

public class function_scoping {
     //we cannot access or use the variable or something declared inside  the function in the outside of the function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fun_scope();
    // System.out.println(num); ERROR: we cannot access the variable inside the function NOTE:it only access or used inside the function scope"
	}
	static void fun_scope() {
		int num=12;
		System.out.println(num);//num only accessible inside the function
	}

}
