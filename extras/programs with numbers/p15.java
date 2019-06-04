// Palindrome number program in java

import java.util.Scanner;
public class p15
{
	public static void main(String[] args) {
        int n, reverse = 0, t;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is a palindrome or not");
		n=sc.nextInt();
         t = n;
         while (t != 0)
          {
              reverse = reverse * 10;
              reverse = reverse + t%10;
              t = t/10;
          }
 
     if (n == reverse)
           System.out.println(n+" is a palindrome number.");
      else
          System.out.println(n+" isn't a palindrome number.");
 
	}
}