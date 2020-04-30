package HomeWork19;

import static java.lang.Thread.sleep;

public class ManTwo extends MoneyOperation implements Runnable{
    private double balance;
    final private String nameOfThread = "SecondMan";

    public String getNameOfThread() {
        return nameOfThread;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

}
