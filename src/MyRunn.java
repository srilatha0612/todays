public class MyRunn implements Runnable {
    @Override
    public void run() {
        System.out.println("run method");
    }
}
class RuuDemo{
    public static void main(String[] args) {
        MyRunn r=new MyRunn();
        Thread t=new Thread(r);
        t.start();
        System.out.println("main thread");
    }
}

