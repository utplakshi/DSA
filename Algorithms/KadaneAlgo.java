
public class kadaneAlgo {
	 public static int kadane(int[] A)
	    {
	        // stores the maximum sum subarray found so far
	        int maxSoFar = 0;
	 
	        // stores the maximum sum of subarray ending at the current position
	        int maxEndingHere = 0;
	 
	        // traverse the given array
	        for (int i: A)
	        {
	            // update the maximum sum of subarray "ending" at index `i` (by adding the
	            // current element to maximum sum ending at previous index `i-1`)
	            maxEndingHere = maxEndingHere + i;
	 
	            // if the maximum sum is negative, set it to 0 (which represents
	            // an empty subarray)
	            maxEndingHere = Integer.max(maxEndingHere, 0);
	 
	            // update the result if the current subarray sum is found to be greater
	            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
	        }
	 
	        return maxSoFar;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		 
	        System.out.println("The sum of contiguous subarray with the " +
	                            "largest sum is " + kadane(A));
	}

}