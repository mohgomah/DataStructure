package ds;

public class BST<T extends Comparable<T>> {

    private int size;
    private TreeNode<T> root;

    public BST() {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean insert(T t) {
        if (contains(t)) {
            return false;
        }
        root = insert(root, t);
        size++;
        return true;
    }

    private TreeNode<T> insert(TreeNode<T> n, T t) {

        if (null == n) {
            return new TreeNode<>(t);
        }

        if (t.compareTo((T) n.getData()) < 0) {
            n.setLeft(insert(n.getLeft(), t));
        } else {
            n.setRight(insert(n.getRight(), t));
        }

        return n;
    }

    public boolean contains(T t) {
        return contains(root, t);
    }

    private boolean contains(TreeNode<T> n, T t) {
        if (n == null) {
            return false;
        } else if (t.compareTo((T)n.getData()) == 0) {
            return  true;
        }

        return t.compareTo((T)n.getData()) < 0 ? contains(n.getLeft(), t) :  contains(n.getRight(), t);
    }

    public void printInOrder() {
        printInOrderHelper(root);
    }

    public void printPreOrder() {
        printPreOrderHelper(root);
    }

    public void printPostOrder() {
        printPostOrderHelper(root);
    }

    private void printInOrderHelper(TreeNode n) {
        if ( null == n )
            return;
        printInOrderHelper(n.getLeft());
        System.out.println( n.getData());
        printInOrderHelper(n.getRight());
    }

    private void printPreOrderHelper(TreeNode n) {
        if (null == n)
            return;
        System.out.println( n.getData());
        printInOrderHelper(n.getLeft());
        printInOrderHelper(n.getRight());
    }

    private void printPostOrderHelper(TreeNode n) {
        if (null == n)
            return;
        printInOrderHelper(n.getLeft());
        printInOrderHelper(n.getRight());
        System.out.println( n.getData());
    }
}
