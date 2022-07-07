public class Exercise5 {
    public static int decimalToBinary(int n) {
        if (n == 0) return 0;
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }
}
