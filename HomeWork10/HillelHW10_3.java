package HomeWork10;

import java.util.Scanner;

public class HillelHW10_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write an A ---> ");
        int a = sc.nextInt();
        System.out.print("Write an B ---> ");
        int b = sc.nextInt();
        System.out.print("Write an C ---> ");
        int c = sc.nextInt();
        //System.out.println("Your quadratic equation looks like --->  "+a+"x²"+b+"x"+c+"=0");
        result(a,b,c);

    }

    public static void result(int a, int b, int c){

        double d = Math.pow(b,2)-4*a*c;

        double x1;
        double x2;
        if(d==0){
            x1 = -b/(2*a);
            System.out.print("Discriminant = ");
            System.out.printf("%.2f",d);
            System.out.println(" ");
            System.out.print("x = ");
            System.out.printf("%.2f",x1);
        } else if(d>0){
            x1 = (Math.sqrt(d) - b)/(2*a);
            x2 = (Math.sqrt(d)*(-1)-b)/(2*a);
            System.out.print("Discriminant = ");
            System.out.printf("%.2f",d);
            System.out.println(" ");
            System.out.print("x1 = ");
            System.out.printf("%.2f  ",x1);
            System.out.print("x2 = ");
            System.out.printf("%.2f  ",x2);
        } else if (d<0){
            System.out.println("Discriminant < 0, need to use <i>");
        }
    }
}
