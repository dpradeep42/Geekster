package DSA_06_Jan_22;

import java.util.Stack;

class MyQueue {
    int curr_size;
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int topelem;

    void push(int x) {
        s1.push(x);
    }

    int pop() {
        if (s2.isEmpty() && s1.isEmpty())
            return -1;
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        int k = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }
        return k;
    }

    int peek() {
        if (s2.isEmpty() && s1.isEmpty())
            return -1;
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        int k = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }
        return k;

    }

    int size() {
        return s1.size();
    }
}

public class QueueUsingStack {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        System.out.println(q.pop());
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(2);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(1);
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}