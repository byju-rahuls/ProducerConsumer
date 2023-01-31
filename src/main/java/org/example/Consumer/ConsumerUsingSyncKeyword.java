package org.example.Consumer;

import org.example.Producer.Stream;

public class ConsumerUsingSyncKeyword {

    public void consume(Stream list) throws InterruptedException {
        synchronized (this) {
            if (list.c == 0)
                wait();
            String consume = list.stream.get(list.c - 1);
            System.out.println("Consumer consume: " + consume);
            list.stream.remove(list.c - 1);
            list.c--;
            notifyAll();
        }
    }
}
