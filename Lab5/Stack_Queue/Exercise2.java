public class Exercise2 {
    public static boolean checkPalindrome (Stack<Character> stack, Queue<Character> queue, int value){
        String number = String.valueOf(value);
        for (char n : number.toCharArray()){
            stack.push(n);
            queue.enQueue(n);
        }
        while (!stack.isEmpty() || !queue.isEmpty()){
            if (stack.pop() != queue.deQueue()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>(10);
        Queue<Character> queue = new Queue<>(10);
        System.out.println(checkPalindrome(stack, queue, 1221));
        // System.out.println("Stack is activated: ");
        // stack.push(1);
        // stack.push(3);
        // stack.push(2);
        // stack.push(1);
        // System.out.println("Queue is activated: ");
        // queue.enQueue(1);
        // queue.enQueue(3);
        // queue.enQueue(2);
        // queue.enQueue(1);
        // System.out.println("Displaying: ");
        // stack.printStack();
        // queue.printQueue();
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());

    }
}
