import java.util.Scanner;
public class p2{
	public static void main(String[] args){
		int a,b,c;
		System.out.println("enter the values of a and b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
}