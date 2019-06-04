//Armstrong number
import java.util.Scanner;
public class p17{
	public static void main(String[] args) {
		
		int num,i,j,temp,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to know whether it is armstrong or not");

		num = sc.nextInt();
		temp = num;
	while(num > 0)
	{
		i = num % 10; 
		sum = sum + i*i*i;
		num = num / 10;
	}
	if(sum == temp){
		System.out.println("Given number "+temp+" is an armstrong number");
	}else
	{
		System.out.println("Given number "+temp+" is not an armstrong number");
	}
  }
}
