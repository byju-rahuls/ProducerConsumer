package org.example.Consumer;
import org.example.Operations.*;
public class Consumer2 implements Runnable{
    Operations obj;
    public Consumer2(Operations obj) {
        this.obj = obj;
        Thread t2 = new Thread(this,"Consumer 2");
        t2.start();
    }

    public void run(){
        for(int i=0; i<10; i++) {
            obj.getValue();
            try{ Thread.sleep(500); } catch (Exception e){ System.out.println(e); }
        }
    }
}