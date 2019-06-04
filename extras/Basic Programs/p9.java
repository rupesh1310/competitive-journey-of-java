// Reverse number program in java


import java.util.Scanner;
public class p9{
public static void main(String[] args){
    int n,rev=0,sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    while(n > 0){
        sum = n % 10;
        rev = rev * 10 + sum;
        n = n / 10;
    }
    System.out.println("The reverse of number is " +rev);
  }
}
