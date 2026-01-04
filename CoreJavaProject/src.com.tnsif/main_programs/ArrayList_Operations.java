package main_programs;
import java.util.ArrayList;
public class ArrayList_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> Alist=new ArrayList<>();
    Alist.add("Nandhini");  //position 0
    Alist.add("Senior");    //position 1
    Alist.add("software");  //position 2
    Alist.add("Developer"); //position 3
    Alist.add("And");       //position 4
    Alist.add("project");     //position 5
    Alist.add("Manager");   //position 7
    System.out.println("the elemnt in the ArrayList are: "+Alist);
    Alist.set(4,"and"); //update the value of position 4 
    //check whether the given value is in ArrayList are not using (contains method)
    System.out.print("Is Nandhini in ArrayList:"+Alist.contains("Nandhini"));    // if Nandhini is in Alist return true else return false
    //to display particular element from arrayList or access Array ArrayList
    Alist.get(2);
    //to delete the element from the ArrayList
    Alist.remove(5);  //it remove element in the 5th index
    //remove all the element in the ArrayList
    Alist.clear();
    System.out.println();
    System.out.println(Alist);
    
	}

}
