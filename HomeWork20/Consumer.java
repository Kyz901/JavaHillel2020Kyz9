package HomeWork20;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable{
    final String nameOfThread = "Consumer";
    static List<Integer> consumerList = new ArrayList<>(10);
    public static int timeConsumer = 3000;

    public String getNameOfThread() {
        return nameOfThread;
    }
    @Override
    public void run() {



        while(!Buffer.isEmpty()){
            try {
                sleep(timeConsumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int current = 0;
            consumerList.add(Buffer.buffer[current]);
            Buffer.buffer[current] = null;
            Buffer.trim();




            Buffer.trim();

            System.out.print(""+getNameOfThread()+" - ");
            Buffer.printBuffer();
            System.out.println("CONSUMERS LIST" +consumerList);
            Buffer.setCurrent(Buffer.getCurrent()-1);
            Buffer.trim();

        }
        if(Buffer.isEmpty()){
            System.out.println("BUFFER EMPTY");
            System.out.print("" + getNameOfThread() + " - ");
            Buffer.printBuffer();
            Manufacturer.timeManufacturer = 1000;
            timeConsumer = 3000;
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
