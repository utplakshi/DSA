//Write a java function to return minimum and maximum in an array. 
//Your program should make the minimum number of comparisons. 
import java.util.*;
public class minandmaxArray {
static class pair{
	int min;
	int max;
}
static pair getMinMax(int a[],int n) {
	pair minmax= new pair();
	int i;
	if(n==1) {
		minmax.max=a[0];
		minmax.min=a[0];
		return minmax;
	}
	//If array has more than one element
	if(a[0]>a[1]) {
		minmax.max=a[0];
		minmax.min=a[1];
	}
	else {
		minmax.max=a[1];
		minmax.min=a[0];
	}
	for(i=2;i<n;i++) {
		if(a[i]>minmax.max) {
			minmax.max=a[i];
		}
		else if(a[i]<minmax.min){
			minmax.min=a[i];
		}
	}
	return minmax;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]=new int[6];
      Scanner in=new Scanner(System.in);
      System.out.print("Enter the value of the array: \n");
      for(int i=0;i<a.length;i++) {
    	  a[i]=in.nextInt();
      }
      int n=a.length;
      pair minmax=getMinMax(a,n);
      System.out.printf("The Maximum element is: %d", minmax.max);
      System.out.printf("\nThe Minimum element is: %d", minmax.min);
	}

}
