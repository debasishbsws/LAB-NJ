package LAB_Assignment_6.Q3;

public class Question3 {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.add(50);
        myStack.add(70);
        myStack.displayElement();
        System.out.println("Pop: " + myStack.remove());

        MyQueue myQueue = new MyQueue();
        myQueue.add(50);
        myQueue.add(70);
        myQueue.displayElement();
        System.out.println("Pop: " + myQueue.remove());

    }
}
