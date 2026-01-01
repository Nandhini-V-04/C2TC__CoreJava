package main_programs;
//when multiple method with same name exist it excute or call based on the datatype of parameter,arrangement of parameter during compile time
//it call the method based the type and arrange of method during the compile time.
public class method_overloading_example_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading_example_program ob=new method_overloading_example_program();
		System.out.println(ob.add(1,2));
		System.out.println(ob.add(10,20,30));
		System.out.println(ob.add(11,22,33,44));
	}
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
