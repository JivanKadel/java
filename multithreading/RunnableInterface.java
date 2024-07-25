class MyThread2 implements  Runnable{
    public void run(){
        int i = 1;
        while(i<=10){
            System.out.println(i + " Sheep");
            i++;
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        MyThread2 mt2  = new MyThread2();
        Thread t1 = new Thread(mt2);
        t1.start();

        int i = 1;
        while(i<=10){
            System.out.println(i + " Cat");
            i++;
        }
    }
}
