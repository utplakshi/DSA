/*An array contains both positive and negative numbers in random order. 
 Rearrange the array elements so that all negative numbers appear before all positive numbers.
 Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 Output: -12 -13 -5 -7 -3 -6 11 6 5*/
import java.util.Scanner;
public class SortNeg {
     static void sort(int a[]){
        int j=0,temp;
    	for(int i=0;i<a.length;i++){
    		if(a[i]<0) {
    			if(i!=j) {
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    			j++;
    		}
    	}	
    }
     static void print(int a[]) {
    	 for(int i=0;i<a.length;i++){System.out.println(a[i]+" ");}
     }
     static void get(int a[]) {
    	 Scanner in= new Scanner(System.in);
    	 for(int i=0;i<a.length;i++) {
    		 a[i]=in.nextInt();
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[6];
        get(a);
        sort(a);
        print(a);
	}
}