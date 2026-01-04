package main_programs;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_intoTHEArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    //first we have to create create object for the sub arrayLists (ArrayList<Integer>)
    for(int i=0;i<3;i++) {   //i=0 initialize 1_first subarrayList1 into main ArrayList, i=1 initialize 2_second subarrayList1 into main ArrayList, i=2 initialize 3_Third into main ArrayList
    	list.add(new ArrayList<>());
    }
    
    //input for each sunArray
    for(int i=0;i<3;i++) {  //i=0 insert value for first arraylist , i=1 insert the elements for 2ArrayLsit,i=3 insert the element for second arrayList
    	for(int j=0;j<3;j++) {
    		list.get(i).add(sr.nextInt());
    	}
   
    }
 	System.out.println(list);
	}

}
