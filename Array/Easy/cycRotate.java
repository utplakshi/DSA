//Complexity is O(n)
//Given an array, cyclically rotate the array clockwise by one. 
import java.util.*;;
class Rotate{
	void rotate(int a[]) {
		int start=0;
		int end= a.length-1;
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class cycRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in= new Scanner(System.in);
        Rotate r= new Rotate();
        System.out.print("Enter the length of array: ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of array: \n");
        for(int i=0;i<n;i++) {
        	a[i]=in.nextInt();
        }
        r.rotate(a);
        System.out.println("The sorted array is: ");
        r.print(a);
	}

}
