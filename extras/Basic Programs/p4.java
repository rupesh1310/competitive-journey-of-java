// Print odd numbers in java is simple program in java to print the odd numbers till N
import java.util.Scanner;
public class p4
{
	public static void main(String[] args) {
      int number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		i = 1;  
		while(i <= number)
		{
			
			i = i + 2;
            System.out.print(i +"\t"); 
		}	
       	}
}