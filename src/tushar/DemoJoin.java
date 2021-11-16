package tushar;

public class DemoJoin {

    public static void main(String args[]) {
        NewThread4 ob1 = new NewThread4("Tushar");
        NewThread4 ob2 = new NewThread4("Shiddarth");
        NewThread4 ob3 = new NewThread4("Ariyan");

        System.out.println("Thread Tushar is alive: "
                + ob1.t.isAlive());
        System.out.println("Thread Shiddarth is alive: "
                + ob2.t.isAlive());
        System.out.println("Thread Ariyan is alive: "
                + ob3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread Tushar is alive: "
                + ob1.t.isAlive());
        System.out.println("Thread Shiddarth is alive: "
                + ob2.t.isAlive());
        System.out.println("Thread Ariyan is alive: "
                + ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
