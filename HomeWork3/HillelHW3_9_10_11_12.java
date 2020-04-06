package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class HillelHW3_9_10_11_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number of elements massive - ");
        int n = sc.nextInt();
        int [] mas = new int[n];

        Random rnd = new Random();
        System.out.print ("Massive looks like -> ");
        for (int i=0;i < mas.length;i++) {
            mas[i] =rnd.nextInt(50) - 5;

            System.out.print(mas[i]+", ");
        }
        int min = mas[0];
        int max = mas[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i=1;i < mas.length;i++) {
            if(mas[i]<min){
                min = mas[i];
                indexOfMin = i;
            }
            if(mas[i]>max){
                max = mas[i];
                indexOfMax = i;
            }
        }
        System.out.println(" ");
        System.out.print("Min number is  '" + min+"'");
        System.out.println(" ");
        System.out.print("Max number is  '" + max+"'");
        mas[indexOfMin] = max;
        mas[indexOfMax] = min;
        double average = 0;
        double sum = 0;
        System.out.println(" ");
        System.out.print("After transformation(value of max replace value of min and back) massive looks like -> ");
        for (int i=0;i < mas.length;i++) {
            System.out.print(mas[i]+", ");
            sum += mas[i];

        }

        average = sum / mas.length;
        System.out.println(" ");
        System.out.print("Average value of numbers massive is "+average);

    }
}
