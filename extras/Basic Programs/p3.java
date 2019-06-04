//Even number program in java is program to print even numbers till N in java.

import java.util.Scanner;
public class p3{
public static void main(String[] args){
    int number,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    number = sc.nextInt();
    for(i = 1;i < number;i++){
        if(i % 2 == 0){
            System.out.print(i + "\t");
      }
    }
  }
}