import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter the number of elements of the Array: ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.print("Enter elements of the Array: \n");
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+(i+1)+"th element of the Array: ");
			a[i]=in.nextInt();
			}
		System.out.println("Even numbers are: ");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("\n");
		System.out.println("Odd numbers are: ");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}