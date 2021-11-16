package tushar;

public class Deadlock implements Runnable{

    A a = new A();
    B b = new B();
    Deadlock() {
        Thread.currentThread().setName("Tushar");
        Thread t = new Thread(this, "Shiddarth");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }
    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }
    public static void main(String args[]) {
        new Deadlock();
    }
}
