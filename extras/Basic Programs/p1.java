//Check even or odd in java is program to check whether number is even or odd.
import java.util.Scanner;
public class p1{
public static void main(String[] args){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    num = sc.nextInt();
    if(num % 2 == 0){
       System.out.println("number is even"); 
    }else{
        System.out.println("number is odd");
     }
    }
}