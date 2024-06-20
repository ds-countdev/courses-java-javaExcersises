package poo_thread;

import poo_thread.runnable.TravelThread;

public class RunnableInterfaceExampleJava8 {
    public static void main(String[] args) {

        var travel = new Runnable(){
            @Override
            public void run() {
                System.out.println("initiating travel to " + Thread.currentThread().getName());
                for (int i=0 ; i < 10; i ++){
                    System.out.println("in " + i);
                    try{
                        Thread.sleep((long) (Math.random() * 1000));
                    }catch (InterruptedException exception){
                        exception.printStackTrace();
                    }
                }
                System.out.println("The travel is going to start finally");
            }
        };

        Runnable travelThread = () ->{
            System.out.println("initiating travel to " + Thread.currentThread().getName());
            for (int i=0 ; i < 10; i ++){
                System.out.println("in " + i);
                try{
                    Thread.sleep((long) (Math.random() * 1000));
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
            System.out.println("The travel is going to start finally");
        };

        new Thread(travel,"Mexico").start();
        new Thread(travel,"Turkey").start();
        new Thread(travelThread,"France").start();
        travelThread.run();
    }
}
