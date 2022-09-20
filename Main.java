import LAB_Assignment_7.Q1.ThreadStack;

public class Main {
    public static void main(String[] args) throws Exception {
        ThreadStack stk = new ThreadStack();
        stk.push(12);
        stk.push(11);
        stk.push(10);
        stk.push(19);
        stk.push(13);
        stk.pop();
        stk.pop();
        stk.display();
    }
}