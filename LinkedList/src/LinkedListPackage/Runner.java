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
        list.deletePositionPreeti(3) ;
        //list.deleteFirst();
        //list.deleteLast();
        list.printList();
    }
}
