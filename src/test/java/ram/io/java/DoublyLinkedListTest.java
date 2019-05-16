package ram.io.java;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    @Test
    public void test_isEmpty(){
        print();
        assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    public void test_size_of_doublyLinkedList(){
        print();
        assertTrue(doublyLinkedList.getSize() == 0);
    }

    @Test
    public void test_insert_at_start(){
        doublyLinkedList.insertAtStart(10);
        print();
    }

    @Test
    public void test_insertElements_fromStart(){
        doublyLinkedList.insertAtStart(10);
        doublyLinkedList.insertAtStart(20);
        doublyLinkedList.insertAtStart(30);
        print();
    }

    @Test
    public void test_insertElements_fromEnd(){
        doublyLinkedList.insertAtEnd(10);
        print();
        doublyLinkedList.insertAtEnd(20);
        print();
        doublyLinkedList.insertAtEnd(30);
        doublyLinkedList.insertAtEnd(40);
        print();
    }

    @Test
    public void test_deleteAtRefPosition(){
        doublyLinkedList.insertAtEnd(10);
        doublyLinkedList.insertAtEnd(20);
        doublyLinkedList.insertAtEnd(30);
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.insertAtEnd(50);
        print();
        doublyLinkedList.deleteAtReference(3);
        print();
    }

    private void print(){doublyLinkedList.printLinkedList();}

}
