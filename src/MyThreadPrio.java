public class MyThreadPrio {
    public void run(){
        System.out.println("run method");
    }
}
class ThreadDEmoPrio{
    public static void main(String[] args) {
        MyThreadPrio m=new MyThreadPrio();
        //m.setPriority(10);
        System.out.println("main method");
    }
}