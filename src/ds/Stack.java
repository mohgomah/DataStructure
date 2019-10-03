package ds;

import java.util.Collections;
import java.util.List;

public class Stack<T> {

    private LinkedList ls = new LinkedList();

    public int size() {
        return ls.size();
    }

    public boolean isEmpty() {
        return ls.size() == 0;
    }

    public void push( T t ) {
        ls.addAtEnd( ls.createNode(t));
    }

    public T pop() {
        return (T) ls.removeAtEnd().getData();
    }

    public T top() {
        if( isEmpty() )
            return null;
        return (T) ls.getTail().getData();
    }

    public void print(){

        List<T> allElements = ls.getAllElements();
        Collections.reverse(allElements);

        System.out.println( allElements ) ;
    }
}
