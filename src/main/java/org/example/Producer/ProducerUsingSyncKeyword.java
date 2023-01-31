package org.example.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerUsingSyncKeyword  {
    public void produce(Stream list) throws InterruptedException {
        synchronized (this) {
            if (list.c == 10)
                wait();
            list.stream.add("P" + list.c);
            System.out.println("Produce Item P" + list.c);
            list.c++;
            notifyAll();
        }
    }
}

