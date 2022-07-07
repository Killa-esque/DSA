import java.util.Scanner;

public class Exercise5 {
    public static boolean isBalanced(char[] arr, Stack<Character> stack) {
        for (char i : arr) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            }
            if (stack.isEmpty()) return false;
            char check;
            switch (i) {
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());      
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        char[] charArr = string.toCharArray();
        // System.out.println(charArr.length);
        Stack<Character> stack = new Stack<Character>(charArr.length);
        if (isBalanced(charArr, stack))
            System.out.println("String is balanced");
        else
            System.out.println("String is not balanced");
        
    }
}
