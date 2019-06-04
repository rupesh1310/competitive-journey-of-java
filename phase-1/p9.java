
//Relational operators
import java.util.Scanner;
public class p9 {
	public static void main(String[] args) {
		int a,b;
		boolean c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a == b);
		System.out.println("a == b " +c);
		c = (a < b);
		System.out.println("a < b " +c);
		c = (a > b);
		System.out.println("a > b " +c);
		c = (a <= b);
		System.out.println("a <= b " +c);
		c = (a >= b);
		System.out.println("a >= b " +c);
		c = (a != b);
		System.out.println("a != b " +c);
	}
}