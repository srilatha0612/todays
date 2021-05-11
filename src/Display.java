public class Display {
    public synchronized void wish(String name){
        for (int i=0;i<5;i++){
            System.out.println("good morning");
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                System.out.println("name");
            }
        }
    }
}
class MyThreading extends Thread{
    Display d;
    String name;
    MyThreading(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
class SynchronizedDemo{
    public static void main(String[] args) {
        Display d1=new Display();
        MyThreading t1=new MyThreading(d1,"dhoni");
        MyThreading t2=new MyThreading(d1,"yuvraj");
        t1.start();
        t2.start();

    }
}
  