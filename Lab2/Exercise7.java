import java.util.Scanner;
public class Exercise7 {
    public static boolean isPalindrome (String string){
        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<Character>(charArray.length);
        Queue<Character> queue = new Queue<Character>(charArray.length);
        for (char c : charArray){
            stack.push(c);
            queue.enQueue(c);
        }
        while (!stack.isEmpty()){
            if (stack.pop() != queue.deQueue()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random string to check: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");
    }
}
