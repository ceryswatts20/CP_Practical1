package Thread;

public class SimpleProgram {
    public static void main(String[] args) {
        // Instantiate threads
        Thread p1 = new Thread1();
        Thread p2 = new Thread2();

        // Run thread
        p1.start();
        p2.start();
    }
}

