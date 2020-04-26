package HomeWork18;

import java.util.Scanner;

public class GiveMoneyThread extends Thread{
    Scanner sc = new Scanner(System.in);
    Scanner scAdressat = new Scanner(System.in);
    CashMachine cashMachine;
    CashMachine tempMachine;
    String login;
    double sumOfTransaction;
    public GiveMoneyThread(String name,String login,double sum) {
        super(name);
        this.login = login;
        this.sumOfTransaction = sum;

    }

    @Override
    public void run() {
        loginCheck(login);
        System.out.println("Введите LOGIN адреса которому желаете переслать деньги --- ");
        String adressat = scAdressat.nextLine();
        if(adressat.length() > 4){

            adressat = adressat.substring(0,4);

        }
        if(HashMaps.hashMapOfPins.get(adressat) != null){

            if(cashMachine.getBalance()-sumOfTransaction < 0){
                System.out.println("Недостаточно средств на счету");

            } else {
                cashMachine.setBalance(cashMachine.getBalance()-sumOfTransaction);
                System.out.println();
                System.out.println(" "+getName()+" - снятие - "+ sumOfTransaction);
                System.out.println();

                Thread take = new TakeMoneyThread(getName(),adressat,sumOfTransaction);
                take.start();
                try {
                    take.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            System.out.println("Такого пользователя не существует");
        }






    }
    public boolean loginCheck(String login){

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
