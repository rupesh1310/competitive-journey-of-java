import java.util.Scanner;
public class p8{
public static void main(String[] args) {
	int a,b;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a");
	a = sc.nextInt();
	b = +a;
	System.out.println("Op + a=" + b);
	b = -a;
	System.out.println("Op  - a=" + b);
	b = a++;
	System.out.println("Op  a++ =" + b);
	b = a--;
	System.out.println("Op  a-- =" + b);
	
	}
}