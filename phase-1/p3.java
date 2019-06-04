


import java.util.Scanner;
public class p3{
	public static void main(String[] args){
		double a,r;
		System.out.println("Enter the area of the cirle: ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Area of the circle is " + a);
	}
}