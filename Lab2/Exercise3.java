public class Exercise3 {

    //Exponential function
    public static int exp(int n) {
        if (n == 0)
            return 1;
        return 2 * (exp(n - 1));

    }
    //Power function
    public static int pow(int a, int n) {
        if (n != 0)
            return a * pow(a, n - 1);
        return 1;
    }
    //Calculate the expression by using Stack
    public static int elimRecursive(int n) {
        Stack<Integer> myStack = new Stack<Integer>(n);
        int result = 0;
        for (var i = n; i != 1; i--) {
            myStack.push(exp(n) + pow(n, 2));
            n--;
        }
        myStack.push(3);
        while (!myStack.isEmpty()) {
            result += myStack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(elimRecursive(5));
    }
}
