package org.example.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerUsingBlockingQueue {
    public void produce(BlockingQueue<String> list) throws InterruptedException {
        list.put("Produce Item P");
        System.out.println("Produce Item P");
    }


}
