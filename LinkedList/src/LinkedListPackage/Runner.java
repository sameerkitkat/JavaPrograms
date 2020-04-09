package LinkedListPackage;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);
        list.addPosition(7,3);
//        list.deletePositionPreeti(3) ;
        list.deletePosition(3);
        list.deleteFirst();
        list.deleteLast();
        list.printList(list.head);

//        list.head.next.next.next =  list.head;
        ReverseLinkedList reverse = new ReverseLinkedList();
        list.head = reverse.reverseList(list.head);
        System.out.println(" ");
        System.out.println("List after reversal");
        list.printList(list.head);

        FindMiddleNode middle = new FindMiddleNode();
        System.out.println(" ");
        middle.findMiddle(list.head);
        System.out.println(" ");

        DetectLoop loop = new DetectLoop();
        boolean isloop= loop.detectLoop(list.head);
        System.out.println("Does list has loop? "+isloop);

        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(list.head);
        System.out.println("Is list palindrome? "+isPalindrome);
    }
}
