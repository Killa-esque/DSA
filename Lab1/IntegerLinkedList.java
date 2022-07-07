import java.util.*;
public class IntegerLinkedList {
    private int size;
    private IntNode head;

    public IntegerLinkedList(){
        this.size = 0;
        this.head = null;
    }
    public boolean isEmpty(){return size == 0;}

    public void addFirst(int item){
        head = new IntNode(head,item);
        size++;
    }
    
    public int countEven()throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        int count = 0;
        IntNode loopNode = head;
        while (loopNode != null){
            if (loopNode.getData() % 2 == 0){
                count++;
            }
            loopNode = loopNode.getNext();
        }
        return count;
    }

    
    public String toString(){
        if(isEmpty())return "[]";
        else{
            StringBuilder sb = new StringBuilder(size);
            sb.append("[");
            IntNode currentNode = head;
            while(currentNode != null){
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

    public boolean isPrime(int n) {
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i< n; i++) {
            if (n % i == 0) {
            return false;
            }
        }
        return true;
    }
    

    
    public int countPrime() throws NoSuchElementException {
        if(isEmpty()) throw new NoSuchElementException("Empty Linked List");
        int count = 0;
        IntNode currentNode = head;
        while (currentNode != null){
            if (isPrime(currentNode.getData())){
                count++;
            }
            currentNode = currentNode.getNext();
        }
        return count;
    }

    
    public void addBe4(int item) throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        IntNode newNode = head;
        while (newNode != null){
            if (newNode.getData() % 2 == 0){
                IntNode addNode = new IntNode(newNode.getNext(),item);
                newNode.setNext(addNode);
                break;
            }
            newNode = newNode.getNext();
        }
    }
    
    
    public int maxNumber() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        int max = head.getData();
        IntNode newNode = head;
        while (newNode != null){
            if (newNode.getData() > max){
                max = newNode.getData();
            }
            newNode = newNode.getNext();
        }
        return max;
    }
}
