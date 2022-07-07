public interface QueueADT<E> {
    public int size();
    public boolean isEmpty();
    public boolean contains(E item);
    public void enQueue(E x)throws IllegalStateException;
    public E deQueue() throws RuntimeException;
    public E peek() throws RuntimeException;
    public void printQueue();
}
