package HomeWork2;

import java.util.Scanner;

public class HillelHW2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double quantityOfNums = 0;
        double sum = 0;
        boolean point = true;
        while(point){
            System.out.print("Write your number - ");
            sum += sc.nextDouble();
            quantityOfNums++;
            System.out.print("Another number? (write 1 'yes' or 0 'no') - ");
            int answ = sc.nextInt();
            if (answ == 1) {
                point = true;

            } else if (answ == 0) {
                point = false;
            } else if (answ != 1 && answ != 0){
                System.out.println("Wrong answer =( Then stop...");
                point = false;
            }
        }
        double aver = sum/quantityOfNums;
        System.out.println("Average - "+aver);

    }



}

