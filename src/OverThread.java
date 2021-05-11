public class OverThread extends Thread {
    public void run(){
        System.out.println("no arg method");
    }
    void run(int i){
        System.out.println("int arg method");
    }
}
class Demo{
    public static void main(String[] args) {
        OverThread o=new OverThread();
        o.run();
    }
}
