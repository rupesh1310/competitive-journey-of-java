import java.util.Scanner;
public class p5{
	public static void main(String[] args){
		double a,l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the l and b");		
		l = sc.nextDouble();
		b = sc.nextDouble();
		a = l * b;
		System.out.println("The area of the rectangle is " + a);
	}
}