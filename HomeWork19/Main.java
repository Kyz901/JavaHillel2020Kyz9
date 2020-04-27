package HomeWork19;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    BankAlfa bank = new BankAlfa(20000);
    HashMaps.hashMapOfPins.put("1",bank);
        System.out.println("В банке сейчас находится "+bank.getBalance()+"$");
    Thread manOne = new Thread(new ManOne());
        Thread manTwo = new Thread(new ManTwo());
        Thread manThree = new Thread(new ManThree());
    manOne.start();
    manTwo.start();
    manThree.start();

    while(manOne.isAlive() || manTwo.isAlive() || manThree.isAlive()){
        sleep(1000);
    }
        System.out.println("В банке сейчас находится "+bank.getBalance()+"$");


    }
}

