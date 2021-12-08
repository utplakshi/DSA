class Main
{
    // Find the minimum sum subarray of a given size `k`
    public static void findSubarray(int[] arr, int k)
    {
        // base case
        if (arr.length == 0 || arr.length <= k) {
            return;
        }
 
        // stores the sum of elements in the current window
        int window_sum = 0;
 
        // stores the sum of minimum sum subarray found so far
        int min_window = Integer.MAX_VALUE;
 
        // stores ending index of the minimum sum subarray found so far
        int last = 0;
 
        for (int i = 0; i < arr.length; i++)
        {
            // add the current element to the window
            window_sum += arr[i];
 
            // if the window size is more than equal to `k`
            if (i + 1 >= k)
            {
                // update the minimum sum window
                if (min_window > window_sum)
                {
                    min_window = window_sum;
                    last = i;
                }
 
                // remove a leftmost element from the window
                window_sum -= arr[i + 1 - k];
            }
        }
 
        System.out.printf("The minimum sum subarray is (%d, %d)", last - k + 1, last);
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 10, 4, 2, 5, 6, 3, 8, 1 };
        int k = 3;
 
        findSubarray(arr, k);
    }
}