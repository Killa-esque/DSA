import java.util.NoSuchElementException;

public class IntLinkedList implements LLInterface{
    private Node head;
    private int size = 0;

    public IntLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size (){
         return size;
    }


    @Override
    public void addFirst(int data) {
        head = new Node(data, head);
        size++;
    }

    @Override
    public void addLast(int data) {
        if (isEmpty()) addFirst(data);
        else{
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(data, null));
            size++;
        }

    }

    @Override
    public boolean removeAt(int position) {
        if (position<0 || position >= size) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            return false;
        }
        if (position == 0) {
            head = head.getNext();
            size--;
            return true;
        }

        int index = 0;
        boolean flag = false;
        Node preNode = null;
        Node currentNode = head;
        while (currentNode != null){
            flag=false;
            if (position == index){
                preNode.setNext(currentNode.getNext());
                size--;
                flag = true;
            }
            preNode = currentNode;
            currentNode = currentNode.getNext();
            index++;
        }

        return flag;
    }

    @Override
    public int countOdd() {
        if (isEmpty()) return 0;
        else{
            int count = 0;
            Node current = head;
            while (current != null){
                if (current.getData() % 2 != 0){
                    count++;
                }
                current = current.getNext();
            }
            return count;
        }
    }

    @Override
    public int searchKey(int key) {
        if (isEmpty()){
            throw new NoSuchElementException("Empty linked list");
        }
        else if(head.getData() == key){
            return 0;
        }
        else if(head.getData() != key){
            int index = 0;
            Node newNode = head;
            while (newNode != null){
                if (newNode.getData()==(key)){
                    return index;
                }
                newNode = newNode.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public boolean checkSorted()
    {
        if (isEmpty())
            return true;
        for (Node t = head; t.getNext() != null; t = t.getNext()){
            if (t.getData() <= t.getNext().getData())
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(size);
            sb.append("[");
            Node currentNode = head;
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


}