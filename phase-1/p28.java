// import java.util.Scanner;
// public class p28{
//     public static void main(String[] args){
//         int count=0,n,x;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number");
//         n = sc.nextInt();
//         while(n != 0){
//             x = n % 10;
//             n = n /10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }



import java.util.Scanner;
public class p28{
public static void main(String[] args){
        int number,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        number = sc.nextInt();

        while(number > 0){
            number = number / 10;
            count = count + 1;
        }
        System.out.println("total digits is: " +count);
    }
}