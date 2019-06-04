import java.util.*;
 
/*Java Program to find square, square root and cube of a given number*/
public class p30 
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Enter an integer number: ");
		num=sc.nextInt();

		System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
		System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
		System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
	}
}

// import java.util.Scanner;

// // the name of our class its public
// public class SquareDigit {
// //void main
// public static void main (String[] args)
// {
// //declare int
// int no,m,s;

// //Declare input as scanner
// Scanner input = new Scanner(System.in);

// //Take input
// System.out.println("Enter Number :");
// no = input.nextInt();

// //add while loop
// while(no>0)
// {
// m=no%10;
// s = m*m;
// System.out.println("Square of "+m+" is "+s);
// no=no/10;
// }
// }
// }