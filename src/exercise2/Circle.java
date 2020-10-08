package exercise2;

import java.util.Scanner;

public class Circle {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter radius:");
    int number = input.nextInt();
    double c = Math.PI;
    double a = 2*c*number;
    double b = c*number*number;
    System.out.print("Circumference:"+ a +"   Area:" + b);


  }
}