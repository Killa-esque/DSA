public class Exercise3 {
    //Define a recursive function public static boolean checkPrime(int n, int d) that check whether a number is prime (d is current divisor to check)
    public static boolean checkPrime(int n, int d){
        if (n <= 2){
            return (n==2) ? true : false;
        }
        else if (n % d == 0){
            return false;
        }
        else if (d * d > n){
            return true;
        }
        return checkPrime(n, d + 1);
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(5, 2));
    }
}