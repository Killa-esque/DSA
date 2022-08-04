import java.util.Stack;

public class Exercise1 {
    public static boolean isOperator (String value){
        switch(value){
            case "+": case "-" : case "*" : case "/" : return true;
            default : return false;
        }
    }

    public static String calculate (String x, String y, String operator){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        switch (operator) {
            case "+" : return String.valueOf(a + b);
            case "-" : return String.valueOf(a - b);
            case "*" : return String.valueOf(a * b);
            case "/" : return String.valueOf(a / b);
            default: return "0";
        }

    }
    public static String calPostfix (String[] spl){
        Stack<String> stack = new Stack<String>();
        for (String s : spl){
            String operator = s;
            if (!isOperator(s)){
                stack.push(s);
            }
            else {
                String a = stack.pop();
                String b = stack.pop();
                String result = calculate (b,a,operator);
                stack.push(result);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String postFix = "9 2 - 6 * 7 + 7 / 7";
        String[] spl = postFix.split(" ");
        System.out.println(Integer.parseInt(calPostfix(spl)));
    }
}
