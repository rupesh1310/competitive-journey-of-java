// Swap two numbers in java is simple program in java for swapping numbers without using 3rd variable
import java.util.Scanner;
public class p6{
public static void main(String[] args){
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    a = sc.nextInt();
    b = sc.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("Swapped value of a : " + a);
    System.out.println("Swapped value of b : " +b);
 }
}