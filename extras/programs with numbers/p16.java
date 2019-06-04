//fibonnacci series

import java.util.Scanner;
public class p16{
	public static void main(String[] args) {
		int i, n,t1 = 0,t2=1,nextTerm;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Number:");
		n = sc.nextInt();
		
		System.out.println("fibonnacci series:");

		for(i = 1;i <= n; i++)
		{

			nextTerm = t1 + t2;
			t1 = t2;
			t2 = nextTerm;
			System.out.println(t1+" ");
		}
	}
}