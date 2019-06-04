import java.util.Scanner;
public class p6{
	public static void main(String[] args){
		double a,b,c,d,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c,d: ");		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		avg = (a + b + c + d) / 4;
		System.out.println("The average of four numbers is " + avg);
	}
}