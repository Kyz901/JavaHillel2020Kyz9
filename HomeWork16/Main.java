package HomeWork16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("---------|   WELCOME IN THE GAME 'ROCK,PAPER,SCISSORS'   |---------");
        System.out.println("-------------------------------------------------------------------");

        while (true) {
            int selected;
            System.out.println();
            System.out.println();
            System.out.println("   1. Start game(" + Game.numberOfGame + " times)");
            System.out.println("   2. Check all results");
            System.out.println("   3. Settings ");
            System.out.println("   4. Clear results ");
            System.out.println("   5. Quit..");
            System.out.println();
            System.out.print("      --->  ");
            try {
                selected = sc.nextInt();


            System.out.println();
            if (selected == 1) {
                Game.startGame(Game.numberOfGame);

                System.out.println();
                System.out.println("-------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------");
            }
             if (selected == 2) {
                 System.out.println("-------------------------------------------------------------------");
                 System.out.println("-------------------------------------------------------------------");
                 System.out.println();

                Game.readFromFile();

                 System.out.println();
                 System.out.println("-------------------------------------------------------------------");
                 System.out.println("-------------------------------------------------------------------");
            }
             if (selected == 3) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------");
                System.out.println();
                System.out.print("Choose a number of the games : ");
                int setUp = sc.nextInt();
                System.out.println();
                System.out.println("-------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------");

                Game.startSett(setUp);

            }
             if(selected == 4){
                Game.clearFile();
             }
             if (selected == 5) {

                Game.bye();

                System.out.println();
                break;
            } if (selected>5) {
                System.out.println("Invalid menu number, try again");
            }
            }catch (Exception e){
                System.out.println("Not a number of menu, close app x( ");
                break;

            }
        }
    }
}
