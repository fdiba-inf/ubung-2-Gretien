package exercise2;

import java.util.Scanner;

public class Circle {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    double a = 2*Math.PI*number;
    double b = Math.PI*number*number;
    System.out.println("Circumference:"+ a);
    System.out.println("Area:"+ b);
  }
}