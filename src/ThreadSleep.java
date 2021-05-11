public class ThreadSleep {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("a");
        Thread.sleep(7000);
        System.out.println("d");
        Thread.sleep(300);
        System.out.println("f");
        Thread.sleep(4000);
        System.out.println("l");


    }
}
