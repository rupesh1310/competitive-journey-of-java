import java.util.Scanner;
public class p10 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		boolean c = ((a == b) && (a != b));
		System.out.println(c);
		c = !(a == b) || (a != b);
		System.out.println(c);
	}
}