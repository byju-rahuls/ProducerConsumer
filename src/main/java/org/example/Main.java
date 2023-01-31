package org.example;
import org.example.Operations.*;
import org.example.Producer.*;
import org.example.Consumer.ConsumerUsingBlockingQueue;
import org.example.Consumer.ConsumerUsingSyncKeyword;
import org.example.Producer.ProducerUsingBlockingQueue;
import org.example.Producer.ProducerUsingSyncKeyword;
import org.example.Producer.*;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;
import org.example.Consumer.*;

public class Main {
    int testCases(int op) throws InterruptedException {
        if (op == 1) {
            System.out.println("\n\nUse Blocking Queue to Implement the Producer and Consumer Problem.\n\n");
            BlockingQueue<String> qu = new ArrayBlockingQueue<>(10);
            System.out.println(qu.size());
            Thread t1 = new Thread(() -> {
                try {
                    ProducerUsingBlockingQueue obj = new ProducerUsingBlockingQueue();
                    for (int i = 0; i < 8; i++) {
                        obj.produce(qu);
                    }
                } catch (InterruptedException e) {
                    System.out.println("List is full not able to produce");
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    ConsumerUsingBlockingQueue obj = new ConsumerUsingBlockingQueue();
                    for (int i = 0; i < 8; i++) {
                        obj.consume(qu);
                    }
                } catch (InterruptedException e) {
                    System.out.println("List is Empty not able to consume");
                }
            });


            t1.start();
            t2.start();
            return 1;
        } else if (op == 2) {
            System.out.println("\n\nUse Synchronized Block to Implement the producer and Consumer Problem.\n\n");
            Stream list1 = new Stream();
            Thread t1 = new Thread(() -> {

                try {
                    ProducerUsingSyncKeyword obj = new ProducerUsingSyncKeyword();
                    for (int i = 0; i < 10; i++) {
                        obj.produce(list1);
                    }
                } catch (InterruptedException e) {
                    System.out.println("List is full not able to produce");
                }
            });
            Thread t2 = new Thread(() -> {

                try {
                    ConsumerUsingSyncKeyword obj = new ConsumerUsingSyncKeyword();
                    for (int i = 0; i < 10; i++) {
                        obj.consume(list1);
                    }
                } catch (InterruptedException e) {
                    System.out.println("List is Empty not able to consume");
                }
            });


            t1.start();
            t1.join();
            t2.start();
            return 1;

        } else if(op==3) {
            Operations obj = new Operations();
            Producer obj1 = new Producer(obj);
            Consumer2 obj2 = new Consumer2(obj);
            return 1;
        } else {
            System.out.println("Enter valid option");
            return 0;
        }



    }

    public static void main(String args[]) throws InterruptedException {
        System.out.println("\n\n1. Use Blocking Queue to Implement the Producer and Consumer Problem.\n\n2. " +
                "2. Use Synchronized Block to Implement the producer and Consumer Problem.\n\n"+
                "3. Use Synchronized Method to Implement the producer and Consumer Problem.\n\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select Option!");
        int op = sc.nextInt();
        Main obj = new Main();
        obj.testCases(op);

    }
}
