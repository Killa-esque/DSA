import javax.lang.model.element.Element;

public class Exercise4 {
    public static int sigma1 (int n){
        if (n == 1) return 2*n + 1;
        return 2*n + 1 + sigma1(n-1);
    }
    public static int sum_fac(int target, int counter) {
        return (target == counter) ? target : counter * (1 + sum_fac(target, counter + 1));
    }
    public static int product_fact (int target, int counter){
        return (target == counter) ? target : counter * (counter* product_fact(target, counter + 1));
    }
    public static int p_n(int r,int n){
        if (r > n || r <= 0) return 1;
        //n(n-1)(n-2)...(n-r+1), n >= r > 0
        return n * p_n(r - 1, n-1);
    }
    public static double e (int n){
        if (n == 1) return 3;
        return Math.pow(2, n) + Math.pow(n,2) + e(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sigma1(5));
        System.out.println(sum_fac(5,1));
        // System.out.println(product_fact(5,1));
        System.out.println(e(5));
        System.out.println(p_n(3,5));
    }
}
