package EasyJava;
// You are using Java
/*WonderWorks Magic Show



The Magic Castle, the home of the Academy of Magical Arts at California has organized the great ‘WonderWorks Magic Show’. 3 renowned magicians were invited to mystify and thrill the crowd with their world’s spectacular magic tricks. At the end of each of the 3 magicians’ shows, the audience were requested to give their feedback in a scale of 1 to 10. Number of people who watched each show and the average feedback rating of each show is known. Write a program to find the average feedback rating of the WonderWorks Magic show.



Input format
First line of the input is an integer value that corresponds to the number of people who watched show 1.

Second line of the input is a float value that corresponds to the average rating of show 1.

Third line of the input is an integer value that corresponds to the number of people who watched show 2.

Fourth line of the input is a float value that corresponds to the average rating of show 2.

Fifth line of the input is an integer value that corresponds to the number of people who watched show 3.

Sixth line of the input is a float value that corresponds to the average rating of show 3.



Output format
Output should display the overall average rating for the show. Display the rating correct to 2 decimal places.



Sample testcases
Input 1
400
9.8
500
9.6
100
5
Output 1
9.22*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class MagicShow{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        DecimalFormat d =new DecimalFormat("0.00");
        int nsh1,nsh2,nsh3;
        float ash1,ash2,ash3,rating=(float) 0.0;
        nsh1=in.nextInt();
        ash1=in.nextFloat();
        nsh2=in.nextInt();
        ash2=in.nextFloat();
        nsh3=in.nextInt();
        ash3=in.nextFloat();
        rating=(nsh1*ash1+nsh2*ash2+nsh3*ash3)/(nsh1+nsh2+nsh3);
        System.out.println(d.format(rating));
    }
}