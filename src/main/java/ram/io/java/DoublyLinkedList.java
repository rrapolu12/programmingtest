package ram.io.java;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){

    }

    public DoublyLinkedList(Node head, Node tail, int size){

        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val) {
        Node newNode = new Node(val,null,null);

        if(head == null){
            head = newNode;
            tail = head;
        }
        else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val,null,null);

        if(head == null){
            head = newNode;
            tail = head;
        }
        else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void deleteAtReference(int refPosition)
    {
        if (refPosition == 1)
        {
            if (size == 1)
            {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            head = head.getNext();
            head.setPrev(null);
            size--;
            return ;
        }
        if (refPosition == size)
        {
            tail = tail.getPrev();
            tail.setNext(null);
            size-- ;
        }
        Node ptr = head.getNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == refPosition)
            {
                Node p = ptr.getPrev();
                Node n = ptr.getNext();

                p.setNext(n);
                n.setPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public void printLinkedList()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0)
        {
            System.out.print("List is Empty\n");
            return;
        }
        if (head.getNext() == null)
        {
            System.out.println(head.getData() );
            return;
        }
        Node pointer = head;
        System.out.print(head.getData()+ " <==> ");
        pointer = head.getNext();
        while (pointer.getNext() != null)
        {
            System.out.print(pointer.getData()+ " <==> ");
            pointer = pointer.getNext();
        }
        System.out.print(pointer.getData()+ "\n");
    }

    final class Node {

        protected int data;
        protected Node prev;
        protected Node next;

        public Node() {
            this.prev = null;
            this.next = null;
            this.data = 0;
        }

        public Node(int data, Node prev, Node next) {

            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public void setNext(Node n) {
            this.next = n;
        }

        public Node getNext() {
            return next;
        }

        public void setPrev(Node p) {
            this.prev = p;
        }
        public Node getPrev() {
            return prev;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                   "data=" + data +
                   ", prev=" + prev +
                   ", next=" + next +
                   '}';
        }
    }

}
