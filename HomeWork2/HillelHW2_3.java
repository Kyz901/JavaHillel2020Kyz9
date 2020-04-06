package HomeWork2;

import java.util.Scanner;

public class HillelHW2_3 {
    public static void main(String[] args) {
        double valueOfInvest;
        double percentInYear;
        int howManyYears = 0;

        double valueOfPercentRate;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write value of invest - ");
        valueOfInvest = sc.nextDouble();
        double currentValueOfInvest = valueOfInvest;
        System.out.print("Write interest rate - ");
        percentInYear = sc.nextDouble();
        System.out.print("Write duration of invest - ");
        howManyYears = sc.nextInt();
        System.out.println("Now your value of invest - "+valueOfInvest);
        for(int year=1;year<howManyYears+1;year++) {
            valueOfPercentRate = (valueOfInvest / 100) * percentInYear;
            valueOfInvest +=  valueOfPercentRate;
            System.out.println("After " +year+ " year you could get +" +valueOfPercentRate+ " hrv and your current value of invest - "+ valueOfInvest+ " hrv ");
        }

    }
}
