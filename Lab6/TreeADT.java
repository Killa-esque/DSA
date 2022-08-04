import java.util.Iterator;

public interface TreeADT<E extends Comparable<E>> {
    boolean isEmpty();
    int size();
    Node<E> getRoot();
    int height();
    boolean contains(E key);
    boolean add(E key);
    boolean remove(E key);
    void traverseAscending();
    void traverseDescending();
    Integer sum (Node<E> node);
    Integer sum ();
    void levelOrder();
    void deleteMin ();
    void deleteMax ();
    E getLeftMostOfRight();
}
