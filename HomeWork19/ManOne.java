package HomeWork19;

import static java.lang.Thread.sleep;

public class ManOne implements Runnable{

    private static double balance;
    final private String nameOfThread = "FirstMan";

    public String getNameOfThread() {
        return nameOfThread;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        ManOne.balance = balance;
    }

    @Override
    public void run() {

        for(int i = 1;i<=10;i++) {
            int money = 100;
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changePlusBalance(money);


        }
        changeMinusBalance(500);
        System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
    }

    public boolean changePlusBalance(double money){
        BankAlfa bank = (BankAlfa) HashMaps.hashMapOfPins.get("1");
        setBalance(getBalance() + money);
        bank.setBalance(bank.getBalance() - money);
        System.out.println(" "+getNameOfThread()+" - пополнение на счет - " + money);
       // System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
        return true;
    }
    public boolean changeMinusBalance(double money){
        BankAlfa bank = (BankAlfa) HashMaps.hashMapOfPins.get("1");
        setBalance(getBalance() - money);
        bank.setBalance(bank.getBalance() + money);
        System.out.println(" "+getNameOfThread()+" - снятие со счета - " + money);
        //System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
        return true;
    }
}
