package HomeWork20;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Manufacturer implements Runnable{

    final String nameOfThread = "Manufacturer";
    public static int timeManufacturer = 1000;
    public String getNameOfThread() {
        return nameOfThread;
    }

    @Override
    public void run() {

        while(!Buffer.isFull()) {
            try {
                sleep(timeManufacturer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int current = Buffer.getCurrent();
            Buffer.trim();
            Random rnd = new Random();

            Buffer.buffer[current] = rnd.nextInt(20);


            Buffer.trim();
            System.out.print("" + getNameOfThread() + " - ");
            Buffer.printBuffer();
            Buffer.setCurrent(Buffer.getCurrent() + 1);
            Buffer.trim();


        }
        if(Buffer.isFull()) {
            System.out.println("BUFFER FULL");
            System.out.print("" + getNameOfThread() + " - ");
            Buffer.printBuffer();
            Consumer.timeConsumer = 1000;
            timeManufacturer = 3000;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Buffer.trim();
            run();
        }

    }


}
