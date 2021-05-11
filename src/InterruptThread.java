public class InterruptThread extends Thread{
    public void run() {
        try {
            System.out.println("im lazy thread");
            Thread.sleep( 4000);
        }
        catch(InterruptedException e){
            System.out.println("im interrupted");

        }
    }
}
class ThreadInt{
    public static void main(String[] args) {
        InterruptThread it=new InterruptThread();
        it.start();
        //it.interrupt();
        System.out.println("im main thread");
    }
}
