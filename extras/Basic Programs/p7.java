// Leap year program in java is very simple and easy program to write.

// In this tutorial, we are going to learn what is leap year , java program for leap year.

// What is a leap year

// Leap year is calendar year having one extra day which is to make a synchronized and seasonal year. Leap year contains 366 days while one ordinary year has 365 days.

// Rules for leap year

// 1. The year is leap year which is perfectly divided by 4 – excepts for year divisible by 100 and not by 400.
// 2. The century years are leap years such as 1600, 2000 and century year 1700, 1800,1900 are not leap year.

// How to find leap year

// 1. The number (year) perfectly divisible by 400 and 4 is a leap year.
// 2. And number perfectly divided by 100 and other year are not leap year.


import java.util.Scanner;
public class p7{
public static void main(String[] args){
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year you want to check: ");
    year = sc.nextInt();
    if(year % 400 == 0){
        System.out.println(year +"year is leap year");
    }
    else if(year % 100 == 0){
        System.out.println(year +"is not a leap year");
    }else if(year%4 == 0){
        System.out.println(year +"year is leap year");
    }
    else{
        System.out.println(year +"year is not a leap year");
    }
 }
}