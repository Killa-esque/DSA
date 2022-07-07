import java.util.*;

public class SinglyLinkedList<E extends Comparable<E>> implements ListInterface<E>{
    private int size;
    private Node<E> head;

    public SinglyLinkedList(){
        this.size = 0;
        this.head = null;
    }

    @Override
    public boolean isEmpty(){return size == 0;}

    @Override
    public int size(){return this.size;}

    public void setHead(Node<E> node){
        this.head = node;
    }

    @Override
    public Node<E> getHead(){
        return head;
    }

    @Override
    public E getFirst()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        return head.getData();
    }
    @Override
    public Node<E> getLast()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        Node<E> tmp = head;
        while (tmp.getNext() != null){
            if (tmp.getNext() == null){
                return tmp;
            }
        }
        return null;
    }
    @Override
    public Node<E> getNodeByIndexOf(int index){
        if (index > size) throw new IllegalArgumentException("Your input is out of range of linked list");
        int i = 0;
        if (index > 0 || index < size){
            Node<E> newNode = head;
            while (newNode != null){
                if (i == index){
                    return newNode;
                }
                newNode = newNode.getNext();
                i++;
            }
        }
        return null;
    }

    @Override
    public boolean contains(E item) throws NoSuchElementException,IllegalArgumentException{
        if (isEmpty()){
            throw new NoSuchElementException("Empty linked list");
        }
        else if (item == null){
            throw new IllegalArgumentException();
        }
        else if(head.getData() == item){
            return true;
        }
        else if(head.getData() != item){
            Node<E> newNode = head;
            while (newNode != null){
                if (newNode.getData().equals(item)){
                    return true;
                }
                newNode = newNode.getNext();
            }
        }
        return false;
    }

    @Override
    public void addFirst(E item){
        head = new Node<>(head,item);
        size++;
    }

    @Override
    public void addLast(E item)throws NoSuchElementException {
        if(isEmpty()) {addFirst(item);}
        Node<E> runNode = head;
        while (runNode.getNext() != null){
            runNode = runNode.getNext();
        }
        Node<E> newNode = new Node<E>(runNode.getNext(),item);
        runNode.setNext(newNode);
        size++;
    }

    @Override
    public void addAfter(Node<E> current, E item)throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty linked list");
        Node<E> newNode = new Node<E>(current.getNext(),item);
        current.setNext(newNode);
        size++;
    }

    @Override
    public void addSortedList(E item){
        if (isEmpty()){
            addFirst(item);
        }
        else if (head.getData().compareTo(item) > 0){
            addFirst(item);
        }
        else{
            Node<E> runNode = head;
            while (runNode.getNext() != null){
                if (runNode.getNext().getData().compareTo(item) > 0){
                    break;
                }
                runNode = runNode.getNext();
            }
            Node<E> newNode = new Node<E>(runNode.getNext(),item);
            runNode.setNext(newNode);
            size++;
        }
    }

    @Override
    public Node<E> removeFirst()throws RuntimeException{
        if(isEmpty()) throw new RuntimeException("Empty Linked List");
        else{
            Node<E> headNode = head;
            head = head.getNext();
            size--;
            return headNode;
        }
    }

    @Override
    public Node<E> removeAfter(Node<E> current) throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> currentNode = head;
        Node<E> preNode = null;
        if(current == head){
            return removeFirst();
        }
        while (currentNode.getNext() != null){
            if (currentNode == current){
                preNode.setNext(currentNode.getNext());
                size--;
            }
            preNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public Node<E> removeLast() throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> currentNode = head;
        Node<E> preNode = null;
        if (currentNode.getNext() == null){
            removeFirst();
        }
        while (currentNode.getNext() != null){
            preNode = currentNode;
            currentNode = currentNode.getNext();
        }
        preNode.setNext(currentNode.getNext());
        size--;
        return currentNode;
    }

    @Override
    public Node<E> removeCurr(Node<E> curr) throws NoSuchElementException,IllegalArgumentException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        if (curr == null) throw new IllegalArgumentException();
        if (curr.equals(head)){
            return removeFirst();
        }
        Node<E> currentNode = head;
        while(currentNode.getNext() != null){
            if (currentNode.getNext() == curr){
                currentNode.setNext(curr.getNext());
                size--;
                return curr;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }



    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(size);
            sb.append("[");
            Node<E> currentNode = head;
            while (currentNode != null) {
                sb.append(currentNode.getData());
                if (currentNode.getNext() != null) {
                    sb.append(",");
                }
                currentNode = currentNode.getNext();
            }
            sb.append("]");
            return sb.toString();
        }

    }
    @Override
    public void reverse() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public Node<E> getMiddleNode (Node<E> head)throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List1");
        Node<E> slow = head;
        Node<E> fast = head.getNext();
        while (fast != null){
            fast = fast.getNext();
            if (fast != null) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
        }
        return slow;
    }

    public Node<E> sortedMerge(Node<E> left, Node<E> right){
        Node<E> result = null;
        if (left == null) return right;
        if (right == null) return left;
        if (left.getData().compareTo(right.getData()) <= 0){
            result = left;
            result.setNext(sortedMerge(left.getNext(), right));
        }
        else{
            result = right;
            result.setNext(sortedMerge(left,right.getNext()));
        }
        return result;
    }

    public Node<E> mergeSort (Node<E> node){
        if (node == null || node.getNext() == null) return node;
        Node<E> mid = getMiddleNode(node);
        Node<E> nextMid = mid.getNext();
        mid.setNext(null);
        Node<E> left = mergeSort(node);
        Node<E> right = mergeSort(nextMid);
        Node<E> sortedList = sortedMerge (left,right);
        return sortedList;
    }

    public void printList(Node<E> node)
    {
        while (isEmpty()) {
            System.out.print(head.getData() + " ");
            node = node.getNext();
        }
    }


}
