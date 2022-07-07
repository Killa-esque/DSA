public class Exercise2 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int exp (int a, int n){
        if (n == 1) {
            return 1;
        }
        return a * exp(a, n - 1);
    }
    public static int countDigit (int n){
        return n >= 10 ? 1 + countDigit(n / 10) : 1;
    }
    public static int findGCD(int a, int b){
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exp(2, 5));
        System.out.println(countDigit(12345));
    }
}