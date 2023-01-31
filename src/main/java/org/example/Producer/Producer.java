package org.example.Producer;

import org.example.Operations.*;
public class Producer implements Runnable{
    Operations obj;
    public Producer(Operations obj){
        this.obj = obj;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }

    public void run(){
        for(int i=0; i<10; i++){
            obj.setValue();
            try{ Thread.sleep(500); } catch (Exception e){ System.out.println(e); }
        }
    }
}