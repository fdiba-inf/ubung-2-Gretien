package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int d1 = a%10;
    int c = a/10;
    int d2 = c%10;
    int d = c/10;
    int d3 = d%10;
    int b = d1 + d2 + d3;
    System.out.println("Sum of digits: " + b);
  }
}
