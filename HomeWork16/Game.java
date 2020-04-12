package HomeWork16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Game {

    static int numberOfGame = 3;
    final static char[] fareWell = new char[] {'T','H','A','N','K','S',' ',
            'F','O','R',' ',
            'T','H','E',' ',
            'G','A','M','E',' ',
            '=',')',
            'P','S',':',' ','C','O','M','P','U','T','E','R','.',};

    public static void bye() throws InterruptedException {

        for(int i = 0;i<fareWell.length-13;i++){

            System.out.print(fareWell[i]);
            sleep(300);
        }
        System.out.println();
        for(int i = fareWell.length-13;i<fareWell.length;i++){
            System.out.print(fareWell[i]);
            sleep(300);
        }


    }
   public static void startGame(int numOfGames){
       int humanChoose;
       int computerChoose;
       int compCount = 0;
       int humanCount = 0;
       String result = "";
       Random rnd = new Random();
       Scanner HumanScanner = new Scanner(System.in);
        for(int i = 1;i<=numOfGames;i++){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("---------|               TRY NUMBER # "+i+"                |----------");
            System.out.println("-------------------------------------------------------------------");
            System.out.println();
            System.out.println("                      < TIME TO CHOOSE >                           ");
            System.out.println("   1. ROCK ");
            System.out.println("   2. PAPER ");
            System.out.println("   3. SCISSORS ");
            humanChoose = HumanScanner.nextInt();
            computerChoose = rnd.nextInt(3)+1;

            String comp = switch(computerChoose){
                case 1 -> "ROCK";
                case 2 -> "PAPER";
                case 3 ->  "SCISSORS";


                default -> throw new IllegalStateException("Unexpected value: " + computerChoose);
            };

            String human = switch(humanChoose){
                case 1 -> "ROCK";
                case 2 -> "PAPER";
                case 3 ->  "SCISSORS";


                default -> throw new IllegalStateException("Unexpected value: " + computerChoose);
            };

            if(humanChoose == 1 && computerChoose == 2) compCount++;
            if(humanChoose == 1 && computerChoose == 3) humanCount++;

            if(humanChoose == 2 && computerChoose == 1) humanCount++;
            if(humanChoose == 2 && computerChoose == 3) compCount++;

            if(humanChoose == 3 && computerChoose == 1) compCount++;
            if(humanChoose == 3 && computerChoose == 2) humanCount++;
            System.out.println("---------------------------------------------");
            System.out.println("  HUMAN : "+human+" - "+comp+" : COMPUTER ");
            System.out.println("    "+humanCount+"           SCORE           "+compCount+"    ");
            System.out.println("---------------------------------------------");


            if(compCount>humanCount){
                result = "COMPUTER";
            } else if (humanCount>compCount){
                result = "HUMAN";
            } else {
                result = "FRIENDSHIP";
            }
        }
       System.out.println();
       System.out.println("-------------   !"+result+" WON!    -------------");

       writeToFile(result,humanCount,compCount);

    }
    public static void writeToFile(String result,int humanCount,int compCount){
        BufferedWriter writer = null;
        try{

             writer = new BufferedWriter(new FileWriter("C://ResultOfTheGames.txt",true));
             writer.append("Game: "+result+" WON(Human - "+humanCount+", Comp - "+compCount+");");
             writer.newLine();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readFromFile(){
        String inputFileName = "C://ResultOfTheGames.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearFile(){
        BufferedWriter writer = null;
        try{
            String startString = "";
            writer = new BufferedWriter(new FileWriter("C://ResultOfTheGames.txt"));
            writer.write(startString);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void startSett(int setUp){
        numberOfGame = setUp;
    }
}
