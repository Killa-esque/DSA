public class QueueBasedStacks extends Exception{
    private int size;

    public QueueBasedStacks(int size) {
        this.size = size;
    }
    Stack<Integer> stack1 = new Stack<Integer>(size);
    Stack<Integer> stack2 = new Stack<Integer>(size);

    public int getSize() {
        return this.size;
    }
        
    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int deQueue() throws Exception {
        while (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            if (stack2.isEmpty()) {
                throw new Exception("Queue is empty");
            }
        }
        return stack2.pop();
    }
    
}
