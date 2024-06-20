package poo_thread.thread;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;

public class NameThread extends Thread {

    public NameThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run(){

        System.out.println("Run method starts".concat(this.getName()));
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName());
        }
        System.out.println("Run method ends");
        super.run();
    }
}
