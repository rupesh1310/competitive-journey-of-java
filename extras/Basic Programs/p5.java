// Swap two numbers in java is simple program in java for swapping numbers.
import java.util.Scanner;
public class p5{
public static void main(String[] args){
    int a,b,c;  
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a;
    a = b;
    b = c;
   System.out.println("After swaping:"
             + " a = " + a + ", b = " + c);
 }
}