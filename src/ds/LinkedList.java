package ds;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public LinkedListNode getTail() {
        return tail;
    }

    public LinkedListNode<T> createNode(T t) {
        return new LinkedListNode<>(t,null,null);
    }

    public void add( LinkedListNode<T> node) {
        addAtEnd(node);
    }

    public void addAtFront( LinkedListNode<T> node ) {
        if( null == node )
            throw new IllegalArgumentException();

        if( null == head ) {
            head = tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }

        size++;
    }

    public void addAtEnd(LinkedListNode<T> node ) {
        if( null == node )
            throw new IllegalArgumentException();

        if ( null == tail ) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
            tail.setNext(null);
        }

        size++;
    }

    public LinkedListNode<T> removeAtFront() {
        if( size == 0 ) {
            throw new RuntimeException("Invalid Process: size is 0 ");
        } else {
            LinkedListNode current = head;
            head = head.getNext();
            head.setPrevious(null);
            size--;
            return current;
        }
    }

    public LinkedListNode<T> removeAtEnd() {
        if( 0 == size ) {
            throw new RuntimeException("Invalid Process: size is 0 ");
        } else {
            LinkedListNode current = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return current;
        }
    }

    public <T> void delete(T t) {
        if( 0 == size )
            throw new RuntimeException("Invalid Process: size is 0 ");

        if( head.getData().equals(t))
            removeAtFront();
        else if( tail.getData().equals(t))
            removeAtEnd();
        else {
            LinkedListNode current = head;

            while ( ! current.getData().equals(t) ) {
                current = current.getNext();
            }

            LinkedListNode previousNode = current.getPrevious();
            LinkedListNode nextNode = current.getNext();

            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
            size--;
        }
    }

    public List<T> getAllElements() {

        ArrayList<T> allElements = new ArrayList<>();
        LinkedListNode current = head;
        while ( null != current ){
            allElements.add((T)current.getData());
            current = current.getNext();
        }

        return allElements;
    }

    public void print() {
        System.out.println(getAllElements().toString());
    }
}
