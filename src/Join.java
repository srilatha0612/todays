public class Join extends Thread {
    public void run(){
        System.out.println("run method");
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException e){

        }
    }
}
class threadsDemo{
    public static void main(String[] args)throws InterruptedException {
        Join jj=new Join();
        jj.start();
        jj.join();
        System.out.println("main methiod");
    }
}

