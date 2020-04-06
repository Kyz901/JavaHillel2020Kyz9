package HomeWork3;

import java.util.Scanner;

public class HillelHW3_4 {
    public static void main(String[] args) {
        oddNumbersWithDoWhile();
        factorialWithDoWhile();
    }

    private static void factorialWithDoWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("    ");
        System.out.print("Write a number - ");
        int n = sc.nextInt();
        int c = 1;
        int fact = 1;

            do {
                if (n == 0) {
                    break;
                } else {
                    fact *= c;
                }
                c++;
            } while (c <= n);
            System.out.println("Factorial of number " + n + " is equals to " + fact);
        }

        private static void oddNumbersWithDoWhile () {
            int i = 0;
            do {
                if (i % 2 != 0) {
                    System.out.print(i + " ");

                }
                i++;
            } while (i <= 100);
        }
    }
