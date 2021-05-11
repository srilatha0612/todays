public class OverridingThread {
    public void start(){
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}
class Demos{
    public static void main(String[] args) {
        OverridingThread oo=new OverridingThread();
        oo.start();
        System.out.println("main method");
    }
}
