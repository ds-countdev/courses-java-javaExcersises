package poo_thread;

import poo_thread.runnable.TravelThread;

public class RunnableInterfaceExample {
    public static void main(String[] args) {

        new Thread(new TravelThread("Mexico")).start();
        new Thread(new TravelThread("Argentine")).start();
        new Thread(new TravelThread("Germany")).start();
        new Thread(new TravelThread("Peru")).start();
    }
}
