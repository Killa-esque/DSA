public interface StackADT<E> {
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public boolean contains(E item);
    public void push(E x);
    public E pop();
    public E peek();
    public void printStack();
}
