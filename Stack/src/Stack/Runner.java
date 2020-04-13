package Stack;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        MinStack min = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Popped element "+stack.pop());
        System.out.println("Popped element "+stack.pop());
        System.out.println("Peek element "+stack.peek());

        stack.printStack();
        System.out.println(" ");

        min.push(5);
        min.push(4);
        min.push(3);
        min.push(2);
        min.push(1);
        System.out.println("Popped element "+stack.pop());

        System.out.println("Minimum element is "+min.getMin());
    }
}
