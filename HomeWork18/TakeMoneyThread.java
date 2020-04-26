package HomeWork18;

import java.util.Scanner;

public class TakeMoneyThread extends Thread{
    Scanner sc = new Scanner(System.in);
    CashMachine cashMachine;
    String login;
    double sumOfTransaction;

    public TakeMoneyThread(String name,String login,double sum) {
        super(name);
        this.login = login;
        this.sumOfTransaction = sum;


    }

    @Override
    public void run() {
        loginCheck(login);

        cashMachine.setBalance(cashMachine.getBalance()+sumOfTransaction);
        System.out.println();
        System.out.println(" "+getName()+" - пополнение - "+ sumOfTransaction);
        System.out.println();


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
