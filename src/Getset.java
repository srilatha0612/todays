public class Getset {
    public static void main(String[] args) {
        Thread.currentThread().setName("abc");
        System.out.println(Thread.currentThread().getName());
    }
}
