class MyThread1 extends Thread{
    public void run(){
        int i = 1;
        while(i<=10){
            System.out.println(i + " Sheep");
            i++;
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();
        int i = 1;
        while(i<=10){
            System.out.println(i + " Cat");
            i++;
        }
    }
}
