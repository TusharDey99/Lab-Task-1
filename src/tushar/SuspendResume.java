package tushar;

public class SuspendResume {

    public static void main(String args[]) {
        NewThread5 ob1 = new NewThread5("Tushar");
        NewThread5 ob2 = new NewThread5("Ariyan");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread Tushar");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread Tushar");
            ob2.mysuspend();
            System.out.println("Suspending thread Ariyan");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread Ariyan");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
