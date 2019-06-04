import java.util.*;
public class p31 {  
public static void main(String[] args) 
{
    int number,sum=0,x;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any digit to calculate:");
    number = sc.nextInt();
    while(number > 0){
        x = number % 10;
        sum = sum + (x*x);
        number = number / 10;
     }
     System.out.println("The sum of square of digts is : " +sum);
    }      
}