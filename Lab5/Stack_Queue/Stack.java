import java.util.EmptyStackException;

public class Stack<E> {
      private E arr[];
      private int top;
      private int capacity;

      public Stack(int size) {
        arr = (E[]) new Object[size];
        capacity = size;
        top = -1;
      }

      // Add elements into stack
      // Check if the stack is empty
      public boolean isEmpty() {
        return top == -1;
      }

      // Check if the stack is full
      public boolean isFull() {
        return top == capacity - 1;
      }

      public void push(E x) {
        System.out.println("    - Pusing " + x);
        arr[++top] = x;
      }

      // Remove element from stack
      public E pop() {
        if (isEmpty()) {
          System.out.println("STACK EMPTY");
          // throw new EmptyStackException();
          System.exit(1);
        }
        return arr[top--];
      }


      public E peek() {
        if (isEmpty()) {
          System.out.println("STACK EMPTY");
          // throw new EmptyStackException();
          System.exit(1);
        }
        return arr[top];
      }

      // Utility function to return the size of the stack
      public int size() {
        if (top == -1){
          return 0;
        }
        return top + 1;
      }


      public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }


      public boolean contains(E item)throws EmptyStackException,IllegalArgumentException {
        if (isEmpty()) throw new EmptyStackException();
        if (item == null) throw new IllegalArgumentException();
        for (var i = 0; i<=top; i++){
            if (arr[i].equals(item)){
              return true;
            }
        }
        return false;
      }
}

//STACK COMPLEXITY (BIG-O NOTATION)
// For the array-based implementation of a stack, the push and pop operations take constant time, i.e. O(1).

// Applications of Stack Data Structure
// Although stack is a simple data structure to implement, it is very powerful. The most common uses of a stack are:

// To reverse a word - Put all the letters in a stack and pop them out. Because of the LIFO order of stack, you will get the letters in reverse order.
// In compilers - Compilers use the stack to calculate the value of expressions like 2 + 4 / 5 * (7 - 9) by converting the expression to prefix or postfix form.
// In browsers - The back button in a browser saves all the URLs you have visited previously in a stack. Each time you visit a new page, it is added on top of the stack. When you press the back button, the current URL is removed from the stack, and the previous URL is accessed.