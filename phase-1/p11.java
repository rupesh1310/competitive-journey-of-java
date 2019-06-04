import java.util.Scanner;
public class p11{
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a & b);
		System.out.println("a & b = " +c);
		c = (a / b);
		System.out.println("a / b = " +c);
		c = (a ^ b);
		System.out.println("a ^ b = " +c);

	}
}