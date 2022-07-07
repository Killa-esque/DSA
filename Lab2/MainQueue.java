public class MainQueue {
    public static void main(String[] args) throws Exception {
        // CircularArrayBasedQueue<Integer> queue = new CircularArrayBasedQueue<>(5);
        // queue.enQueue(5);
        // queue.enQueue(2);
        // queue.enQueue(3);
        // queue.enQueue(4);
        // queue.enQueue(6);
        // queue.printQueue();

        QueueBasedStacks queueBasedStacks = new QueueBasedStacks(5);
        queueBasedStacks.enqueue(1);
        queueBasedStacks.enqueue(2);
        queueBasedStacks.enqueue(3);
        queueBasedStacks.enqueue(4);
    
        System.out.println(queueBasedStacks.deQueue());
        

    }
}
