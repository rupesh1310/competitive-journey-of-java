


// //using while loop
// import java.util.Scanner;
// public class p16 {
// 	public static void main(String[] args) {
// 			int i,n;
// 			Scanner sc = new Scanner(System.in);
// 			System.out.println("enter Number:");
// 			n = sc.nextInt();
// 			i = 1;
// 			System.out.println("Odd numbers upto: "+ n);
// 			while(i <= n){
				// i = i + 2;
// 				System.out.println(i + "\t");
// 				
// 			}

// 		}
// 	}



//using for loop
import java.util.Scanner;
public class p16 {
	public static void main(String[] args) {
			int i,n;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Number:");
			n = sc.nextInt();
			System.out.println("Odd numbers upto: "+ n);
			for(i = 1;i <= n;i=i+2){
					System.out.println(i + "\t");
			}
		}
	}


////using modulo operator
// import java.util.Scanner;

// public class p16 {
// 	private static Scanner sc;
// 	public static void main(String[] args) 
// 	{
// 		int n, i;
// 		sc = new Scanner(System.in);
		
// 		System.out.print(" Please Enter any Number : ");
// 		n = sc.nextInt();	
		
// 		for(i = 1; i <= n; i++)
// 		{
// 			if(i % 2 != 0)
// 			{
// 				System.out.print(i +"\t"); 
// 			}
// 		}	
// 	}
// }


// //even numbers upto n
// import java.util.Scanner;
// public class p16 {
// 	public static void main(String[] args) {
// 			int i,n;
// 			Scanner sc = new Scanner(System.in);
// 			System.out.println("enter Number:");
// 			n = sc.nextInt();
// 			System.out.println("even numbers upto: "+ n);
// 			for(i = 2;i <= n;i=i+2){
// 					System.out.println(i + "\t");
// 			}
// 		}
// 	}



// //using modulo
// import java.util.Scanner;
// public class p16 {
// 	public static void main(String[] args) {
// 			int i,n;
// 			Scanner sc = new Scanner(System.in);
// 			System.out.println("enter Number:");
// 			n = sc.nextInt();
// 			System.out.println("even numbers upto: "+ n);
// 			for(i = 1; i <= n; i++)
// 		{
// 			if(i % 2 == 0)
// 			{
// 				System.out.print(i +"\t"); 
// 			}
// 		}	
// 	}
// }
