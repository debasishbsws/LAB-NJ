package LAB_Assignment_7.Q2;

public class Q2 {
    public static void main(String[] args) {
        new PrintClass(Thread.MIN_PRIORITY, 100, "Thread 1");
        new PrintClass(Thread.MAX_PRIORITY, 50, "Thread 2");
    }
}

class PrintClass implements Runnable {

    Thread t;
    int n;
    String s;

    PrintClass(int priority, int n, String name) {
        t = new Thread(this, name);
        t.setPriority(priority);
        t.start();
        this.n = n;
    }

    @Override
    public void run() {

        for (int i = 1; i <= n; i++) {
            System.out.println(t.getName() + " " + i);
        }
        System.out.println("Thread " + t.getName() + " is exiting");
    }
}
