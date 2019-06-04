import java.util.Scanner;
public class p29{
public static void main(String[] args){
        int number,count = 0,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        number = sc.nextInt();
        while(number != 0){ //also while(number > 0)
            x = number % 10;
            count = count + x;
            number = number / 10;
        }
        System.out.println("digits when added value is: " +count);
    }
}
