//Given an array A[] consisting 0s, 1s and 2s.
// The task is to write a function that sorts the given array. 
//The functions should put all 0s first, then all 1s and all 2s in last.
import java.util.*;
public class sort01and2 {
static void sort(int[] arr) {
	int temp;
	int low=0;
	int high=arr.length-1;
	int mid=0;
	while(mid<=high) {
		switch(arr[mid]) {
		case 0:
			temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			low++;
			mid++;
			break;
		case 1:
			mid++;
			break;
		case 2:
			temp=arr[mid];
			arr[mid]=arr[high];
			arr[high]=temp;
			high--;
			break;
		}
	}
	
}
static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<a.length;i++) {a[i]=in.nextInt();}
		System.out.println("Array before sorting or performing Dutch National Flag Problem");
		printArray(a);
		sort(a);
		System.out.println("\nArray After sorting or performing Dutch National Flag Problem");
		printArray(a);
	}

}
