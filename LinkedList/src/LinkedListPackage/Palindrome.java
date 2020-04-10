package LinkedListPackage;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(Node head){
        Node current = head;
        Stack stack = new Stack();
        while(current!=null){
            stack.push(current.data);
            current=current.next;
        }
        while (head!=null){
            if(head.data!=(int)stack.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
