package Stack;

public class Stack {

    int top = -1;
    int size = 5;
    int[] arr = new int[size];

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack full");
        } else {
            top++;
            arr[top] = data;
        }
    }

    public int pop() {
        int var=0;
        if (isEmpty()) {
            System.out.println("Stack empty");
        } else {
            var = arr[top];
            top--;
        }
        return var;
    }

    public int peek(){
        int var=0;
        if (isEmpty()) {
            System.out.println("Stack empty");
        } else {
            var = arr[top];
        }
        return var;
    }

    public void printStack(){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
