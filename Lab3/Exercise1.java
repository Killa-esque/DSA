public class Exercise1 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int exponential (int x, int n){
        int exp = 1;
        for (int i = 1; i <=n; i++) {
            exp *= x;
        }
        return exp;

    }
    public static int countDigit (int n){
        int count = 0;
        while (n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static int GCD (int a, int b){
        int gcd = 1;
        if (a > b){
            for (int i = b; i > 0; i--){
                if (a % i == 0 && b % i == 0){
                    gcd = i;
                }
            }
        }
        else {
            for (int i = a; i > 0; i--){
                if (a % i == 0 && b % i == 0){
                    gcd = i;
                }
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exponential(5,2));
        System.out.println(countDigit(12345));
        System.out.println(GCD(12,15));

    }
}
