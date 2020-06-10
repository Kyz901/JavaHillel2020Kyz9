package HomeWork30;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import static java.lang.Thread.sleep;

public class Manufacture {

    private final static String QUEUE_NAME = "First_Queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        Connection connection;
        ConnectionFactory factory;
        Channel channel;
        Random rnd = new Random();
        String text = (" " + rnd.nextInt(20));

        factory = new ConnectionFactory();
        factory.setHost("localhost");
        connection = factory.newConnection();
        channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        while(true) {
            channel.basicPublish("", QUEUE_NAME, null, text.getBytes());
            System.out.println(" [x] Sent '" + text + "'");
            sleep(1000);
        }
    }
}
