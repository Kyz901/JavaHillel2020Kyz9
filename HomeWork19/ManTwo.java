package HomeWork19;

import static java.lang.Thread.sleep;

public class ManTwo implements Runnable{
    private static double balance;
    final private String nameOfThread = "SecondMan";

    public String getNameOfThread() {
        return nameOfThread;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        ManTwo.balance = balance;
    }
    @Override
    public void run() {
        for(int i = 1;i<=20;i++) {
            int money = 200;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changePlusBalance(money);


        }
        changeMinusBalance(200);
        changeMinusBalance(400);
        System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
    }
    public boolean changePlusBalance(double money){
        BankAlfa bank = (BankAlfa) HashMaps.hashMapOfPins.get("1");
        setBalance(getBalance() + money);
        bank.setBalance(bank.getBalance() - money);
        System.out.println(" "+getNameOfThread()+" - пополнение на счет - " + money);
        //System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
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
