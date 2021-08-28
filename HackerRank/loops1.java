/*
Task
Given an integer, N , print its first 10 multiples. Each multiple Nxi  (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer,N .

Constraints
2<=N<=20
Output Format

Print 10 lines of output; each line  (where 1<=i<=10 ) contains the result of  in the form  N x i:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <=10; i++)
        {
            System.out.println(N + " x "+i+" = "+i*N);
        }
    }
}