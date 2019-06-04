import java.util.Scanner;
public class p4{
	public static void main(String[] args){
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers a and b");		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = ( a + b ) / 2;
		System.out.println("The average of two numbers is " + c);
	}
}