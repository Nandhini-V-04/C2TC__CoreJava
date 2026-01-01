package main_programs;
import java.util.Scanner;         
public class rotationforOneposition {
	void singleShift(int arr[],int n,int di){
        int d=di%n;//to reduce unwanted or repeated shifting process
        int[] temp=new int[d];
        System.out.println("array after shifted by left rotations using d positions");
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        // here we are going to left shift the remaining elements towards front of the array.
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];// its the element for d-n into index 0->d that is like d=3
        }
        //final loop here we are going to insert the element in the temp into the original arr for comnining and for complete the process of left shifting using d position
        for (int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
       
       for(int store:arr){
    	   
        System.out.print(""+store);
       }
    }
    public static void main(String[]args){
        rotationforOneposition ob=new rotationforOneposition();
       int arr[]={1,2,3,4,5,6,7};
       int n=arr.length;
       Scanner sr=new Scanner(System.in);
       System.out.println("enter d value");
       int di=sr.nextInt();
       ob.singleShift(arr,n,di);

    }
}

