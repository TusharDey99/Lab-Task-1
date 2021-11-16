package tushar;

public class MultiThreadDemo {

    public static void main(String args[]) {
        new NewThread3("Tushar"); // start threads
        new NewThread3("Shiddarth");
        new NewThread3("Ariyan");
        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
