package main_programs;

public class checkArrayisDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {5,4,2,2,1};
      
      for(int i=1;i<arr.length-1;i++) {
    	  if(arr[i]>=arr[i-1]) {
    	  
    	  }
    	  else {
    		  System.out.println(" a descending order");
    	  }
      
	}
      System.out.println("not a decending order");
	}
}


