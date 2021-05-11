public class Yield extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("child method");
        }
    }
}
class Demoy{
    public static void main(String[] args) {
        Yield y=new Yield();
        y.start();
        Thread.yield();
        System.out.println("main method");
    }
}