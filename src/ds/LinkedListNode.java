package ds;

import java.util.Objects;

public class LinkedListNode<T> {

    private T data;
    private LinkedListNode next;
    private LinkedListNode previous;

    public LinkedListNode(T data, LinkedListNode next, LinkedListNode previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListNode previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        return  Objects.equals( data, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
