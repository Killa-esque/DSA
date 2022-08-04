public class Exercise3 {
    public static double a_1 (int n){
        return n==0 ? 2 : 2 - (a_1(n-1)/2);
    }
    public static double a_2 (int n){
        double sum = 0.0;
        double temp = 2;
        for (var i = 1 ; i<=n; i++){
            sum = 2 - (temp/2);
            temp = sum;
        }
        return sum;
    }

    public static double b_1 (int n){
        if (n<10) return 1;
        else return 1+b_1((n-1)/10);
    }

    public static double b_2 (int n){
        double sum = 0.0;
        for (var i = 1 ; i<=n; i++){
            if (i < 10)
                sum = 1;
            else
                sum = 1+b_2((i-1)/10);
        }
        return sum;
    }
    public static double c_1 (int n, int k){
        if (k == 1) return n;
        else return n + c_1 (n,k-1);
    }
    //Do same c_1(int n, int k) but with iteration
    public static double c_2 (int n, int k){
        double sum = 0.0;
        for (var i = 1 ; i<=k; i++){
            if (k == 1)
                sum = n;
            else
                sum += n;
        }
        return sum;
    }
    //F(n − 1) + F(n − 2), F(1) = 1, F(0) = 0

    //calculate fibonacci number with recursion
    public static int d_1 (int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return d_1(n - 2) + d_1(n - 1);
    }

    //calculate fibonacci number with iteration
    public static int d_2 (int n){
        int previousNumber = 0;
        int nextNumber = 1;
        for (int i = 2; i <= n; ++i) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return nextNumber;
    }
    public static void main(String[] args) {
        System.out.println(a_1(5));
        System.out.println(a_2(5));
        System.out.println(b_1(1000));
        System.out.println(b_2(1000));
        System.out.println(c_1(100,500));
        System.out.println(c_2(100,500));
        System.out.println(d_1(5));
        System.out.println(d_2(5));

    }
}
