    import java.util.*;
    public class Queue<E> implements QueueADT<E>{
        private final E[] array;
        private int front;
        private int end;
        private final int size;

        public Queue(int maxSize) {
            front = end = 0;
            size = maxSize + 1;
            array =  (E[]) new Object[size];
        }
        public boolean isFull(){
            return end == size - 1;
        }

        @Override
        public void enQueue(E element) {
            array[end] = element;
            if(++end == size) end = 0;
            if(end == front) throw new RuntimeException("Queue is full!");
        }

        @Override
        public E deQueue() {
            if(isEmpty()) throw new RuntimeException("Queue is empty");
            E deQueuedElem = array[front];
            if(++front == size) front = 0;
            return deQueuedElem;
        }

        @Override
        public E peek() throws RuntimeException {
            if(isEmpty()) throw new RuntimeException("Queue empty");
            return array[front];
        }

        @Override
        public int size() {
            if (front > end) return (end + size - front);
            return end - front;
        }

        @Override
        public boolean isEmpty() {
            return front == end;
        }

        @Override
        public boolean contains(E item) throws RuntimeException,IllegalArgumentException{
            if (isEmpty()) throw new RuntimeException();
            if (item == null) throw new IllegalArgumentException();
            for (var i = front; i<=end; i++){
                if (array[i].equals(item)){
                    return true;
                }
            }
            return false;
        }

        @Override
        public void printQueue() {
            if (isEmpty()){
                System.out.println("Queue is empty");
            }
            else{
                for (var i = front; i<end; i++){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }