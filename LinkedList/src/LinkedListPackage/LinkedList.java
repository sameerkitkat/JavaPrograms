package LinkedListPackage;

public class LinkedList {

    public Node head;

    public void addFirst(int data){
        Node node = new Node(data,null);
        if (head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data){
        Node node = new Node(data,null);
        if (head == null){
            head = node;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
    }

    public void addPosition(int data, int position){
        int count = 1;
        Node node = new Node(data,null);
        Node current = head;
        while (count!=position-1){
            current = current.next;
            count ++;
        }
        node.next = current.next;
        current.next = node;
    }

    public void deleteFirst(){
        if (head.next == null){
            head = null;
        }
        else{
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head.next == null){
            head = null;
        }
        else{
            Node current = head;
            while (current.next.next!=null){
                current = current.next;
            }
            current.next=null;
        }
    }

    public void deletePosition(int position){
        Node current = head;
        Node temp;
        int count=1;
        while (count!=position-1){
            current=current.next;
            count++;
        }
        temp = current.next;
        current.next = temp.next;
    }

    public void deletePositionPreeti(int position){
        Node current = head;
        Node prev=head;
        int count=1;
        while (count!=position){
            prev=current;
            current=current.next;
            count++;
        }
        prev.next = current.next;
    }

        public void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
}
