package EasyJava;

//You are using Java
/*Change Position

The room that Patrick and Johnny were staying was very big. They felt lazy to walk inside the room from the bed's location to another location. So they wanted to change the position of the bed. The shape of the room is a Square. They decided to place the bed at the exact center of the room so that their walking distance would be minimised. Can you please help them in placing the bed at the exact centre?



Given the coordinates of the left bottom vertex of the square room and the length of the side, you need to write a program to determine the coordinates of the centre of the room.

[Assumption --- Length of the side is always even]

Input format
Input consists of 3 integers. The first integer corresponds to the x-coordinate of the left bottom vertex. The second integer corresponds to the y-coordinate of the left bottom vertex. The third integer corresponds to the length of the square.

Output format
The output prints the x and y coordinates of the center separated by a space.

Sample testcases
Input 1
10
30
16
Output 1
18 38*/
import java.io.*;
import java.util.*;
class Changeposition{
 public static void main(String[] args){
     int x,y,length,cx,cy;
     Scanner in=new Scanner(System.in);
     x=in.nextInt();
     y=in.nextInt();
     length=in.nextInt();
     cx=x+(length/2);
     cy=y+(length/2);
     System.out.println(cx+" "+cy);
 }
}