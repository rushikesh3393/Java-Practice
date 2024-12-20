
import java.lang.*;

class A extends Thread {
    private volatile boolean running = true;

    public void stopThread() {
        running = false;
    }

    public void run() {
        try {
            for (int i = 1; i < 5 && running; i++) {
                System.out.printf("First Thread = %d\t%b\n", i, isAlive());
                
                if (i == 3) {
                    stopThread();
                }
                Thread.sleep(10000);
            }
        } catch (Exception ex) {
            System.out.println("Error is:" + ex);
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.printf("Second Thread = %d\t%b\n", i, isAlive());
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("Error is:" + ex);
        }
    }
}

public class IsAliveCheck {
    
    public static void main(String[] args) throws Exception {
        A a1 = new A();
        a1.start();
        a1.join();
        System.out.printf("The First Thread is:%b\n", a1.isAlive());

        B b1 = new B();
        b1.start();
        b1.join();
        System.out.printf("The Second Thread is:%b\n", b1.isAlive());
    }
}

	