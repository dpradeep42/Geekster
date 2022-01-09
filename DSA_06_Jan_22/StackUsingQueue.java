package DSA_06_Jan_22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1 = new ArrayDeque<Integer>();
    Deque<Integer> q2 = new ArrayDeque<Integer>();
    int curr_size;

    MyStack() {
        curr_size = 0;
    }

    public void push(int x) {
        curr_size++;
        q1.add(x);
        ;
        while (!q1.isEmpty()) {
            q2.addFirst(q1.peek());
            q1.remove();
        }

    }

    void pop() {
        if (q2.isEmpty())
            return;
        q2.remove();
        curr_size--;
    }

    int top() {
        if (q2.isEmpty())
            return -1;
        return q2.peek();
    }

    int size() {
        return curr_size;
    }
}

public class StackUsingQueue {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);

        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();

    }

}