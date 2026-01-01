package main_programs;
//1. we can update the variable value initialized outside the block.
//2. we can also declare and initialize the value inside the {}->block but its only accessible inside the block
//3. we can declare and initial the same variable declared inside the {}->block
//4. we cannot declare and initialize the same variable declared and intialized outside the {}->block
//5. outside int a=10;->correct    again while we try to declare and intialize the same variable inside the block{ int a=12;->error
public class block_Scoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=10;
      int num1=345;
      System.out.println("num value: "+num);
      System.out.println(num1);
      {
    	//     int num=12;//we cannot declare & initialize inside the same variable declared outside the function
    	  num=200;   
    	  int c=100;
    	     System.out.println(c);
      }
     // System.out.println(c); //we cannot access the value of variable declared inside the block
      int c=120;  //we can create the same variable that we already declared inside the {}->block
      System.out.println(c);
      System.out.println("num value after updated inside the {num=200 from num=10}->block "+num);
	}

}
