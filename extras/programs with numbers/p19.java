import java.util.Scanner;
public class p19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = 0,r =0,t=0,si=0;

		System.out.println("enter principle : ");
		p = sc.nextInt();
		System.out.println("enter rate of interest : ");
		r = sc.nextInt();
		System.out.println("enter time : ");
		t = sc.nextInt();

		si = (p*r*t)/100;
		System.out.println("simple interest is : "+si);
	}
}