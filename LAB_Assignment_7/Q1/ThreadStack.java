package LAB_Assignment_7.Q1;

public class ThreadStack {
    int top;
    int[] stk;
    int size;

    public ThreadStack() {
        top = -1;
        stk = new int[10];
        this.size = 10;
    }

    public ThreadStack(int size) {
        top = -1;
        stk = new int[size];
        this.size = size;
    }

    public void push(int data) {
        Thread pushData = new Thread((new Runnable() {
            @Override
            public void run() {
                if (top == size - 1) {
                    System.out.println("Stack overflow");
                    return;
                }
                stk[++top] = data;
                System.out.println("PUSH " + data);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }));
        pushData.start();
    }

    public int pop() {
        int popItem = -1;

        Thread popData = new Thread((new Runnable() {
            @Override
            public void run() {
                if (top == -1) {
                    System.out.println("Stack underflow");
                } else {
                    top--;
                    System.out.println("POP : " + stk[top + 1]);
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }));

        popData.start();

        return popItem;
    }

    public void display() {
        for (int i = 0; i <= top; i++)
            System.out.print(stk[i] + " ");
        System.out.println();
    }
}
