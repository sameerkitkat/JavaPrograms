package Stack;

import java.util.Stack;

public class MinStack {
    java.util.Stack<Integer> stack;
    java.util.Stack<Integer> minstack;

    public MinStack() {
        stack = new java.util.Stack<>();
        minstack = new java.util.Stack<>();
    }

    public void push(int x) {
        if (minstack.isEmpty() || x<=minstack.peek()){
            minstack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
