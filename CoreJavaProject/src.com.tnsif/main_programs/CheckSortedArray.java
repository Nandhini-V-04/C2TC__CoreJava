package main_programs;

public class CheckSortedArray {
    public static String isSorted(int[]arr) {
    	int n=arr.length-1;
    	for(int i=1;i<n;i++) {
    		if(arr[i]<arr[i-1]) {
    			return "false";
    		}   
    	}
    		
    	return "true";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,3,2,4,4,5,6};
    System.out.println("the given array is Sorted"+isSorted(arr));
	}

}
