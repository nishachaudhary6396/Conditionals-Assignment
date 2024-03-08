package Conditional_Assignment;
import java.util.Scanner;
//Q1:- Write a java function that takes an integer as input and prints "Even" if the number is even and "Odd" if it's odd
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0) System.out.print("Even");
        else System.out.print("Odd");
    }
}


package Conditional_Assignment;
import java.util.Scanner;
//Create a java method to find and print the absolute value of an integer without using the built-in Math.abs()Function.
public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n<0) System.out.print(-n);
        else System.out.print(n);
    }
}


package Conditional_Assignment;
import java.util.Scanner;
// Design a java program that calculates and prints whether a transaction results in a profit, loss , or break-even
//based on the cost price or selling price.
public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a selling price:  ");
        int sp = sc.nextInt();
        System.out.println("Enter a cost price : ");
        int cp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit of " + (sp-cp));
        }
       if(cp>sp){
           System.out.println("Loss of "+ (cp-sp));
       }
       if(cp==sp){
           System.out.println("No profit and loss : ");
       }
    }
}


package Conditional_Assignment;
import java.util.Scanner;
//implement a java function to determine if a given year is a leap year or not . print "Leap year" if true , otherwise
// print "Not a Leap year" .
public class AssignmentQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int n = sc.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0) ){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}


package Conditional_Assignment;
import java.util.Scanner;
// Write a java program to find and print the greatest of three numbers entered by user.
public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        System.out.println("Enter a third number : ");
        int c = sc.nextInt();
        if(a>b && a>c ){
            System.out.println(a+  " is greater ");
        }
        else if(b>a && b>c ){
            System.out.println(b+ " is greater ");
        }
        else
            System.out.println(c +" is greater ");
    }
}


package Conditional_Assignment;
import java.util.Scanner;
// create a java function that takes three integers parameters representing the sides of a triangle and prints whether
// it's equilateral . isosceles , or scalene
public class AssignmentQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first side : ");
        int a = sc.nextInt();
        System.out.println("Enter a second side : ");
        int b = sc.nextInt();
        System.out.println("Enter a third side : ");
        int c = sc.nextInt();
        if(a==b && b==c){
        System.out.println("Equilateral triangle");
        }
        else if(a==b || b==c || a==c){
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}


package Conditional_Assignment;
import java.util.Scanner;
// Develop a java program to find and print the least of three numbers using nested if-else statement
public class AssignmentQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        System.out.println("Enter a third number : ");
        int c = sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("a is smaller");
            }
            else System.out.println("c is smaller");
        }
        else { //(b<a)
            if(b<c){
                System.out.println("b is smaller ");
            }
            else System.out.println("c is smaller ");
        }
    }
}

