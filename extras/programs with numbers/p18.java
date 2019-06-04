// Java program to calculate compound interest
public class p18{
	public static void main(String[] args) {
		
		double principle = 10000, rate = 10.25,time = 5;
		
		double CI = principle * (Math.pow((1+rate/100), time));

		System.out.println("compound interest : " +CI);
	}
}

// 1. First we write class

// 2. Declare variables

// principal => to store principal amount

// rate => to store rate of interest

// time => to store no of years for compound interest

// 3. Next using formula calculate compound interest

// compoundInterest=(float)(principal*(pow((1+(rate/(100*n))),(n*time))));

// This is a simple way to write a expression in c programming.

// compoundInterest=(float)(5000*(pow((1+(5/(100*12))),(12*10))));

// compoundInterest = 8235.047852

// 7. Next print the compound interest that we calculated using formula.

// printf(“Compound Interest is %f\n”,compoundInterest);

// => Compound Interest is 8234.047852