package LAB_Assignment_6;

public class MyQueue implements LinearDS {

    int front, rear;
    int queue[] = new int[MAXSIZE];

    MyQueue() {
        front = -1;
        rear = -1;
    }

    @Override
    public void add(int data) {
        if (rear == MAXSIZE - 1) {
            System.out.println("Queue Overflow ");
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;
    }

    @Override
    public int remove() {

        if (front == -1) {
            System.out.println("Queue underflow");
            return Integer.MIN_VALUE;
        }

        return queue[front++];
    }

    @Override
    public void displayElement() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
}
