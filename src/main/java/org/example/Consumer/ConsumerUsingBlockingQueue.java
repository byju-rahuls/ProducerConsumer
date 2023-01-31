package org.example.Consumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerUsingBlockingQueue {
    public void consume(BlockingQueue<String> list) throws InterruptedException {
        list.take();
        System.out.println("Consume Item P");
    }
}
