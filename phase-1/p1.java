// public class p1{
// 	public static void main(String[] args){
// 		int a,b,c;
// 		a=10;
// 		b=20;
// 		c = a + b;
// 		System.out.println("The sum of two numbers is " + c);
// 	}
// }

//Scanner class 
import java.util.Scanner;
public class p1{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("The sum of two numbers is " + c);
	}
}