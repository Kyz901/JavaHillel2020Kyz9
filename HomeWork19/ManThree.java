package HomeWork19;

import static java.lang.Thread.sleep;

public class ManThree extends MoneyOperation implements Runnable{

    private double balance;
    final private String nameOfThread = "ThirdMan";

    public String getNameOfThread() {
        return nameOfThread;
    }

    public double getBalance() {
        return balance;
    }

    public  void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public void run() {
        for(int i = 1;i<=10;i++) {
            int money = 250;
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changePlusBalance(money);


        }
        changeMinusBalance(1100);
        System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
    }

}
