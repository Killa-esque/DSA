import java.util.NoSuchElementException;

public class DoubleLinkedList{
    private int size;
    private DoubleNode head;

    public DoubleLinkedList(){
        this.size = 0;
        this.head = null;
    }
    public boolean isEmpty(){return size == 0;}
    public int size(){return this.size;} 
    public DoubleNode getHead(){
        return head;
    }    
    public double getFirst()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        return head.getData();
    }
    public DoubleNode getLast()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        DoubleNode tmp = head;
        while (tmp.getNext() != null){
            if (tmp.getNext() == null){
                return tmp;
            }
        }
        return null;
    }
    public void addFirst(double item){
        head = new DoubleNode(head,item);
        size++;
    }
    public void addLast(double item)throws NoSuchElementException {
        if(isEmpty()) {addFirst(item);}
        DoubleNode runNode = head;
        while (runNode.getNext() != null){
            runNode = runNode.getNext();
        }
        DoubleNode newNode = new DoubleNode(runNode.getNext(),item);
        runNode.setNext(newNode);
        size++;
    }
    public boolean contains(double item) throws NoSuchElementException{
        if (isEmpty()){
            throw new NoSuchElementException("Empty linked list");
        } 
        else if(head.getData() == item){
            return true;
        }
        else if(head.getData() != item){
            DoubleNode newNode = head;
            while (newNode != null){
                if (newNode.getData() == item){
                    return true;
                }
                newNode = newNode.getNext();
            } 
        }
        return false;  
    }
    public String toString(){
        if(isEmpty())return "[]";
        else{
            StringBuilder sb = new StringBuilder(size);
            sb.append("[");
            DoubleNode currentNode = head;
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
}