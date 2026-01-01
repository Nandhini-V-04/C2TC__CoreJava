package main_programs;
//shadowing is declaring variable before main function
// here static x=10 its accessible for full program inside the shadowing class 
// we should declare static variable
// the static x=10 is accessible for all the method declared inside the shadowing class 
public class shadowing {
     static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(x);// here the value is 10
   int x=1000;
   System.out.println("after updation inside the main function: "+x);
   first();
   second();
   third();
	}
	static void first() {
		System.out.println("before updation "+x);//x=10
        int x=22;
		System.out.println("after updation "+x);//x=22
	}
	static void second(){
		System.out.println(x);//x=10
	}
    static void third() {
    	System.out.println(x);//x=10
    }
}
