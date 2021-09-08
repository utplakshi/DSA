

//You are using Java
/*Customized Welcome Message

 

Nikhil, the founder of “Pine Tree” company wished to design an Event Management System that would let its Customers plan and host events seamlessly via an online platform.

 

As a part of this requirement, Nikhil wanted to write a piece of code for his company’s Examly Event Management System that will display customized welcome messages by taking Customers’ name as input. Help Nikhil on the task.

Input format
First line of the input is a string that corresponds to a Customer’s name. 

Output format
Output should display the welcome message along with the Customer’s name.

Sample testcases
Input 1
Benny
Output 1
Hello Benny ! Welcome to Examly Event Management System*/
package EasyJava;
import java.io.*;
import java.util.*;
class Customized{
 public static void main(String[] args){
     String name;
     Scanner in=new Scanner(System.in);
     name=in.nextLine();
     System.out.println("Hello "+name+" ! Welcome to Examly Event Management System");
 }
}