import java.util.concurrent.TimeUnit;

class PrintI extends Thread{
    public void run(){
        System.out.println("-- I -- Thread running. " +  Thread.currentThread().getName());
        System.out.println("I alive ? = " + isAlive());
        System.out.println("I state = " + getState());
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
class PrintJ extends Thread{
    public void run(){
        System.out.println("-- J -- Thread running. " + Thread.currentThread().getName());
        System.out.println("J alive ? " + isAlive());
        System.out.println("J state = " + getState());
        for (int j = 10; j < 20; j++) {
            System.out.println("j = " + j);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        PrintI ph = new PrintI();
        ph.setPriority(10);
        PrintJ ph1 = new PrintJ();
        ph1.setPriority(3);
        System.out.println("I alive ?  " + ph.isAlive());
        System.out.println("I state = " + ph.getState());
        System.out.println("J alive ? " + ph1.isAlive());
        System.out.println("J state = " + ph1.getState());
        ph.start();
        ph1.start();

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
        System.out.println("I alive ?  " + ph.isAlive());
        System.out.println("I state = " + ph.getState());
        System.out.println("J alive ? " + ph1.isAlive());
        System.out.println("J state = " + ph1.getState());
        }
    }
}
