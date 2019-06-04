import java.util.Scanner;
public class p7{
public static void main(String[] args) {
	int a,b;
	double c;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b");
	a = sc.nextInt();
	b = sc.nextInt();
	c = a + b;
	System.out.println("a + b = " + c);
	c = a - b;
	System.out.println("a - b = " + c);
	c = a * b;
	System.out.println("a * b = " + c);
	c = a / b;
	System.out.println("a / b = " + c);
	c = a % b;
	System.out.println("a % b = " + c);						
	}
}