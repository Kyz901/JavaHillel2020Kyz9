package HomeWork19;

public class MoneyOperation {
    private static double balance;
    final private String nameOfThread = "Basic Thread";

    public String getNameOfThread() {
        return nameOfThread;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized boolean changePlusBalance(double money){

        BankAlfa bank = (BankAlfa) HashMaps.hashMapOfPins.get("1");
        setBalance(getBalance() + money);
        bank.setBalance(bank.getBalance() - money);
        System.out.println(" "+getNameOfThread()+" - пополнение на счет - " + money);
        //System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
        return true;
    }

    public boolean changeMinusBalance(double money){
        BankAlfa bank = (BankAlfa) HashMaps.hashMapOfPins.get("1");
        setBalance(this.getBalance() - money);
        bank.setBalance(bank.getBalance() + money);
        System.out.println(" "+getNameOfThread()+" - снятие со счета - " + money);
        //System.out.println("Текущий баланс - "+getNameOfThread()+" - "+ getBalance());
        return true;
    }
}
