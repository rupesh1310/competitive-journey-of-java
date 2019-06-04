// Sum of digits in a number

import java.util.Scanner;
public class p14{
	public static void main(String[] args) {
		
		int n, sum = 0,x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		n = sc.nextInt();

			while(n > 0){
			x = n % 10;
			sum = sum + x;
			n = n / 10;
		}
		System.out.println("The sum of all digits " +sum);

	}
}