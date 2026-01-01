package main_programs;
import java.util.Arrays;
import java.util.*;
public  class removeDupUSingSet{
    public static int remDup(int n,int[]arr) {
    	Set<Integer> st=new HashSet<>();
    	for(int i=0;i<n;i++) {
    		st.add(arr[i]);
    	}
    	int index=0;
    	for(int value:st) {
    		arr[index]=value;
    		index++;
    	}
    	return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,3,3,4,4};
int n=arr.length;
System.out.println("the sorted array length is:"+remDup(n,arr));
	}

}
