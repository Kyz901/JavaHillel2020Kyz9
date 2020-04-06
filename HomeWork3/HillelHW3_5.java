package HomeWork3;

import java.util.Scanner;

public class HillelHW3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a 'x' - ");
        int x = sc.nextInt();
        System.out.print("Write a 'n' - ");
        int n = sc.nextInt();
        int count = 0;
        int pow = 1;
        if (n == 0) {

        } else if (x == 0) {
            pow = 0;
        } else {
            while (count < n) {
                pow *= x;
                count++;
            }
        }
        System.out.println(x + "^" + n + " is equals to " + pow);
    }
}
