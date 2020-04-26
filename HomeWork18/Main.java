package HomeWork18;

import java.util.Scanner;

public class Main {
    static CashMachine cashMachine;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println();

        System.out.println(" WELCOME VISITORS IN MY ATM");
        System.out.println();
        int i =0;

        String login = getLogin();
        loginCheck(login);
        while(true){
            System.out.println("Текущий пользователь - "+ cashMachine.getLogin());
            System.out.println();
            System.out.println("1. Пополнить баланс");
            System.out.println("2. Перевести деньги на другой счет");
            System.out.println("3. Проверить баланс");
            System.out.println("4. Другой пользователь");
            System.out.println("5. Выйти из банкомата");
            System.out.println();

            choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Введите сумму пополненя ---- ");
                double sum = sc.nextDouble();
                Thread takeMoney = new TakeMoneyThread(""+i+++" Thread",login,sum);
                takeMoney.start();
                takeMoney.join();



            } else
            if(choice == 2){
                System.out.print("Введите сумму которую желаете переслать ---- ");
                double sum = sc.nextDouble();
                Thread giveMoney = new GiveMoneyThread(""+i+++" Thread",login,sum);
                giveMoney.start();
                giveMoney.join();


            }else
            if(choice == 3){

                Thread check = new CheckBalanceThread(""+i+++" Thread",login);
                check.start();
                check.join();
            }else if(choice == 4){
                login = getLogin();
                loginCheck(login);
            }else if(choice == 5){
                System.out.println("Thank you for using our ATM =)");
                System.exit(0);
            } else {
                System.out.println("Continue");
            }
        }
    }
    static public String getLogin(){

        Scanner loginScanner = new Scanner(System.in);
        System.out.print("Введите LOGIN(4 символа) --- ");

        String login = loginScanner.nextLine();
        System.out.println();
        return login;

    }
    public static boolean loginCheck(String login){

        if(HashMaps.hashMapOfPins.containsKey(login)){
            cashMachine = (CashMachine) HashMaps.hashMapOfPins.get(login);

            return true;
        } else {
            cashMachine = new CashMachine(login);
            HashMaps.hashMapOfPins.put(login,cashMachine);


            return false;
        }
    }


}

