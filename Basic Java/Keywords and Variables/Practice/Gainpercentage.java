package EasyJava;
//You are using Java
/*Calculating Gain Percentage

Vikram buys an old scooter for Rs. A and spends Rs. B on its repairs. If he sells the scooter for Rs. C , what is his gain %?



Write a program to compute the gain %.

Input format
First line of the input consists of the price of the scooter.

Second line of the input consists of the repair charges.

Third line of the input consists of the selling price.

Output format
Output prints the gain percentage. Round off the output to two decimal places.

Sample testcases
Input 1
4700
800
5800
Output 1
5.45*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class Gainpercentage{
 public static void  main(String[] args){
  int p,r,sp;
  float g;
  DecimalFormat d= new DecimalFormat("0.00");
  Scanner in=new Scanner(System.in);
  p=in.nextInt();
  r=in.nextInt();
  sp=in.nextInt();
  g=((float)(sp-p-r)/(float)(p+r))*100;
  System.out.println(d.format(g));
 }
}