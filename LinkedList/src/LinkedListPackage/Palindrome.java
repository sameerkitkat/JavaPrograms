package LinkedListPackage;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(Node head){

        Stack stack = new Stack();
        while(head!=null){
            stack.push(head.data);
            head=head.next;
        }
        while (head!=null){
            if(head.data!=(int)stack.pop()){
                return false;
            }
        }
        return true;
    }
}
