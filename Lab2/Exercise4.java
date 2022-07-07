import java.util.Scanner;
public class Exercise4 {
    public static void reverse(String string) {
        char[] arr = string.toCharArray();
        Stack<Character> myStack= new Stack<>(arr.length);
        for (char i : arr) {
            myStack.push(i);
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
        myStack.printStack();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String charArr = input.nextLine();
        reverse(charArr);
    }
}
