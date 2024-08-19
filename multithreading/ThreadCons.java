class MyRunInt implements Runnable{
    public  void run(){}
}
class MyThreadA extends  Thread{
    public MyThreadA(String name){
        super(name);
    }
}
public class ThreadCons {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunInt(), "First");
        System.out.println(t1.getName());
        System.out.println(t1.threadId());
        MyThreadA t2 = new MyThreadA("Second");
        System.out.println(t2.getName());
        System.out.println(t2.threadId());
    }
}
