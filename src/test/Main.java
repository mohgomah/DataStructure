package test;

import ds.LinkedList;
import ds.LinkedListNode;
import ds.Queue;
import ds.Stack;

public class Main {

    public static void main(String[] args) {

        //LinkedList Test
        System.out.println("\n************ LinkedList ************\n");
        LinkedList<Integer> ls = new LinkedList<>();

        try {
            ls.delete(1);
        } catch (RuntimeException e) {
            e.printStackTrace(); // Invalid Process: size is 0
        }

        LinkedListNode<Integer> n1 = ls.createNode(1);
        LinkedListNode<Integer> n2 = ls.createNode(2);
        LinkedListNode<Integer> n3 = ls.createNode(3);

        ls.add(n1);
        ls.add(n2);
        ls.add(n3);

        System.out.println("size: " + ls.size()); //  size: 3
        ls.print(); // [1, 2, 3]

        ls.delete(2);

        System.out.println("size: " + ls.size()); // size: 2
        ls.print(); // [1, 3]

        //Queue Test
        System.out.println("\n************ Queue ************\n");

        Queue<String> queue = new Queue<>();

        try {
            queue.poll();
        } catch (RuntimeException e) {
            e.printStackTrace(); // Invalid Process: size is 0
        }

        System.out.println( queue.peek() ); // null

        queue.offer( "X");
        queue.offer( "Y");
        queue.offer( "Z");
        queue.print(); // [X, Y, Z]
        System.out.println( "size: " + queue.size() + ", Peek: "+ queue.peek()); // size: 3, Peek: X
        System.out.println( queue.poll() ); // X
        queue.print(); // [Y, Z]
        System.out.println( "size: " + queue.size() + ", Peek: "+ queue.peek()); // size: 2, Peek: Y

        //Stack Test
        System.out.println("\n************ Stack ************\n");
        Stack<String> stack = new Stack<>();

        try {
            stack.pop();
        } catch (RuntimeException e) {
            e.printStackTrace(); // Invalid Process: size is 0
        }

        System.out.println( stack.top() ); // null

        stack.push( "a");
        stack.push( "b");
        stack.push( "c");
        stack.print(); //[c, b, a]
        System.out.println( "size: " + stack.size() + ", Top: "+ stack.top()); // size: 3, Top: c
        System.out.println( stack.pop() ); // c
        stack.print(); // [b, a]
        System.out.println( "size: " + stack.size() + ", Top: "+ stack.top()); // size: 2, Top: b

    }
}
