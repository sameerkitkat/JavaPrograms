package LinkedListPackage;

public class FindMiddleNode {
    public void findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        if (head!=null){
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.print("Middle node is "+slow.data);
        }
    }
}
