// Java program to check person is eligible for voting or not
import java.util.Scanner;
public class p8{
    public static void main(String[] args){
       int age;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age pf the person:");
       age = sc.nextInt();
       if(age >= 18){
            System.out.println("person is eligible for voting");
       } else{
            System.out.println("person is not eligible for voting");
       }
    }
}