//Factorial of a number

import java.util.Scanner;
public class p12{
	public static void main(String[] args) {
		
		int c,n,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		n = sc.nextInt();

		for(c = 1;c <= n;c++){
			fact = fact * c;
			System.out.println("Factorial of "+n+" = "+fact);
		}
	}
}