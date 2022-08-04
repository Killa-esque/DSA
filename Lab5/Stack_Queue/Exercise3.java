public class Exercise3 {
    public static String reverse (String string){
        Stack<String> stack = new Stack<>(string.length());
        String result = "";
        for (String sub :  string.split(" ")){
            stack.push(sub);
        }
        while (!stack.isEmpty()){
            result += stack.pop() + " ";
        }
        return result;
    }
    public static void main(String[] args) {
        String string = "I like apple";
        System.out.println(reverse(string));
    }
}
