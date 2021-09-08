// You are using Java
/*Tile Game

 

In connection to the National Mathematics Day celebration, the Regional Mathematical Scholars Society had arranged for a Mathematics Challenge Event where school kids participated in large number. Many interesting math games were conducted, one such game that attracted most kids was the tile game where the kids were given 'n' square tiles of the same size and were asked to form the largest possible square using those tiles.

 

Help the kids by writing a program to find the area of the largest possible square that can be formed, given the side of a square tile (in cms) and the number of square tiles available.

Input format
First line of the input is an integer that corresponds to the side of a square tile (in cms).

Second line of the input is an integer that corresponds to the number of square tiles available.

Output format
Output should display the area of the largest possible square that can be formed (in square cms) with the available tiles.

Sample testcases
Input 1
5
8
Output 1
100*/
package EasyJava;
import java.io.*;
import java.util.*;
import java.math.*;
class AreaofMaxSquare{
    public static void  main(String[] args){
        int side,a=0,n,i=1,result,area;
        Scanner in=new Scanner(System.in);
        side=in.nextInt();
        n=in.nextInt();
        result=(int)((int)Math.pow(2,i)*Math.pow(2,i));
        while(result<n){
            a=result;
            i++;
            result=(int)((int)Math.pow(2,i)*Math.pow(2,i));
        }
        area=side*side;
        System.out.println(area*a);
    }
}