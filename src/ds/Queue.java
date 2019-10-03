package ds;

public class Queue<T> {
    private LinkedList<T> ls = new LinkedList<>();

    public int size() {
        return ls.size();
    }

    public boolean isEmpty() {
        return  ls.size() == 0;
    }

    public void offer( T t ) {
        ls.addAtEnd( ls.createNode(t));
    }

    public T poll() {
        return (T) ls.removeAtFront().getData();
    }

    public T peek() {
        if( isEmpty() )
            return null;
        return (T) ls.getHead().getData();
    }

    public void print() {
        ls.print();
    }
}
