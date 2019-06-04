
//Assignment Operators
import java.util.Scanner;
public class p12{
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		a += b;
		System.out.println("a += b\t=>" +a);
		c = a;
		System.out.println("c == a\t=>" +c);
		a -= b;
		System.out.println("a -= b\t=>" +a);
		a /=b;
		System.out.println("a /= b\t=>" +a);
		a %= b;
		System.out.println("a %= b\t=>" +a);
	}
}