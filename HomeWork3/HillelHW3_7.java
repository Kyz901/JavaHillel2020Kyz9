package HomeWork3;

import java.util.Scanner;

public class HillelHW3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number - ");
        int x = sc.nextInt();
        for(int i =1; i<10;i++){
            int res = x*i;
            System.out.println(x+"*"+i+" = "+ res);
        }
    }
}
