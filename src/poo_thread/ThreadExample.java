package poo_thread;

import poo_thread.thread.NameThread;

import javax.naming.Name;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        var threadName = new NameThread("Diego");
        var threadNameTwo = new NameThread("Alejandro");
        var threadNameThree = new NameThread("Maria");


        threadName.start();
        threadNameTwo.start();
        threadNameThree.start();
        Thread.sleep(100);
        System.out.println(threadName.getState());
    }
}
