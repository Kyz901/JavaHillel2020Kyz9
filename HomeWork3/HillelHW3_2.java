package HomeWork3;

import java.util.Scanner;

public class HillelHW3_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number - ");
        int n = sc.nextInt();

        factorial(n);

    }

    public static void factorial(int n) {
        int fact = 1;
        if (n == 0) {

        } else {
            for (int i = 1; i <= n; i++) {

                fact *= i;

            }
        }
        System.out.println("Factorial of number "+n+" is equals to "+fact);
    }
}
