package heinzawaung;

import java.util.Scanner;

class Counter extends Thread{

    private volatile boolean appRun = true;
    private int apple = 1;
    public void run() {
        while (appRun){
            System.out.println("This is " + apple);
            apple++;
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stopRun(){
        appRun = false;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        counter.stopRun();
    }
}

