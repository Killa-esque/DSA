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
    public void setHead(Node<E> head);

    //Add element
    public void addFirst(E item);
    public void addAfter(Node<E> current, E item)throws NoSuchElementException;
    public void addLast(E item)throws NoSuchElementException;
    public void addSortedList(E item);

    //Remove element
    public Node<E> removeFirst() throws RuntimeException;
    public Node<E> removeAfter(Node<E> current)throws NoSuchElementException;
    public Node<E> removeLast()throws NoSuchElementException;
    public Node<E> removeCurr(Node<E> curr)throws NoSuchElementException,IllegalArgumentException;

    //Reversing
    public void reverse() throws NoSuchElementException;

    //Print element
    public String toString();


    //Sort linked list
    public Node<E> mergeSort(Node<E> head);

    //Diplaying Linked List
    public void printList (Node<E> head);
}