package HomeWork20;

import static java.lang.Thread.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Manufacturer manufacturer = new Manufacturer();
        Consumer consumer = new Consumer();
        Thread threadOne = new Thread(manufacturer);
        Thread threadTwo = new Thread(consumer);
        threadOne.setPriority(MAX_PRIORITY);
        threadTwo.setPriority(MIN_PRIORITY);
        threadOne.start();
        threadTwo.start();
        threadTwo.sleep(500);
        while (threadOne.isAlive() | threadTwo.isAlive()) {
            sleep(1000);
        }

        System.out.println();
        Buffer.printBuffer();


    }


}

