package HomeWork3;

import java.util.Scanner;

public class HillelHW3_3 {
    public static void main(String[] args) {
        oddNumbersWithWhile();
        factorialWithWhile();
    }

    private static void factorialWithWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("    ");
        System.out.print("Write a number - ");
        int n = sc.nextInt();
        int c = 1;
        int  fact = 1;

        while (c <= n) {
            if (n == 0) {
                break;
            } else {
             fact *= c;
            }
            c++;
        }
        System.out.println("Factorial of number "+n+" is equals to "+fact);
    }

    private static void oddNumbersWithWhile() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
            i++;
        }
    }


}
