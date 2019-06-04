//Sum of n numbers

import java.util.Scanner;
public class p13{
	public static void main(String[] args) {
		int n,sum = 0,c,value;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to add:");

		n = sc.nextInt();

		System.out.println("enter " +n+" integers");

		for(c = 1;c <= n; c++){
			value = sc.nextInt();
			sum = sum + value;
		}
		System.out.println("sum of integers = " +sum);
	}
}