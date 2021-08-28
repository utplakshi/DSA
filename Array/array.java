//Array Basics
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//define an array
		int a[]=new int[5];
		Scanner in=new Scanner(System.in);
//get values into the array
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();		
			}
//printing the values in same line
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			//To print in same line 
			//System.out.println(a[i]);
		}
	}
}
