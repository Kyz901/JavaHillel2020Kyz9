package HomeWork2;

import java.util.Scanner;

class HillelHW2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a first num - ");
        double a = sc.nextInt();
        System.out.print("Write a second num - ");
        double b = sc.nextInt();
        System.out.println("Average - "+averAB(a,b));
    }

    public static double averAB(double a,double b){
        return (a+b)/2*2*2;

    }
}
