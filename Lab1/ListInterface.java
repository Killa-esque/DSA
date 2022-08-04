import java.util.*;
public interface ListInterface<E>{
    //Check List Empty
    public boolean isEmpty();

    //Get size
    public int size();

    //Check if there's  Node or Data in list or not
    public boolean contains(E item) throws NoSuchElementException,IllegalArgumentException;

    //Search element
    public Node<E> getHead();
    public E getFirst()throws RuntimeException;
    public Node<E> getLast()throws RuntimeException;
    public Node<E> getNodeByIndexOf(int index);

    //Add element
    public void addFirst(E item);
    public void addAfter(Node<E> current, E item)throws NoSuchElementException;
    public void addLast(E item)throws NoSuchElementException;

    //Remove element
    public Node<E> removeFirst() throws RuntimeException;
    public Node<E> removeAfter(Node<E> current)throws NoSuchElementException;
    public Node<E> removeLast()throws NoSuchElementException;
    public Node<E> removeCurr(Node<E> curr)throws NoSuchElementException,IllegalArgumentException;

    //Loop list
    // public E countEven()throws NoSuchElementException;
    // public E countPrime()throws NoSuchElementException;
    // public void addBe4(E item) throws NoSuchElementException;
    // public E maxNumber() throws NoSuchElementException;
    public void reverse() throws NoSuchElementException;


    //Print element
    public String toString();

    public void setHead(Node<E> head);


    public void selection ();
    // public void insertion ();

    public void printList (Node<E> head);
}