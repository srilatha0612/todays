public class MyMainThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run method");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("i got interrupted ");
        }
    }
}
class  Dem1{
    public static void main(String[] args) {
        MyMainThread m=new MyMainThread();
        m.start();
        m.interrupt();
        System.out.println("end of main thread");
    }
}

