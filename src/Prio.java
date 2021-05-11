public class Prio {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(5);
        System.out.println(Thread.currentThread().getPriority());
    }
}
