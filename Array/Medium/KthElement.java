//K’th Smallest/Largest Element in Unsorted Array
//Given an array and a number k where k is smaller than the size of the array, 
//we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.
import java.util.Arrays;
import java.util.Scanner;

public class KthElement {
// TODO Auto-generated method stub
public static int kthSmallest(int[] arr,int k)
{
// Sort the given array
Arrays.sort(arr);

// Return k'th element in
// the sorted array
return arr[k - 1];
}

// driver program
public static void main(String[] args)
  {
Scanner in=new Scanner(System.in);
System.out.print("Enter the value of K: ");
int k= in.nextInt();
System.out.print("Enter the length of the array: ");
int n=in.nextInt();
int[] arr = new int[n];
if(k>arr.length) {
	System.out.print("The Kth element is larger than array size");
}
else {
	System.out.printf("Enter the %d elements of the array: \n",n);
	for(int i=0;i<arr.length;i++) {arr[i]=in.nextInt();}
}
System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}

