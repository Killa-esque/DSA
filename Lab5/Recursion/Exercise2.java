public class Exercise2 {
    public static double a_1 (int n){
        if (n == 1) return 2;
        return Math.pow(2,n) + a_1(n-1);
    }
    public static int a_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum += Math.pow(2, i);
        }
        return sum;
    }
    public static int b_1(int n){
        if (n == 0) return 0;
        return (n+1)/2 + b_1(n-1);
     }
     public static int b_2(int n){
        int sum = 0;
        for (var i = 0; i<=n; i++){
            sum += (i+1)/2;
        }
        return sum;
     }
     public static int fact (int n) {
        if (n == 0) return 1;
        return n*fact(n-1);
     }
     public static int c_1 (int n){
        if (n == 1) return 1;
        return fact(n)/fact(n-1) + c_1(n-1);
     }
     public static int c_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum +=  fact(i)/fact(i-1);
        }
        return sum;
    }
    public static int d_1 (int n){
        if (n == 1) return 0;
        return (n*(n-1)) + d_1(n-1);
     }
    public static int d_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum +=  i*(i-1);
        }
        return sum;
    }
    public static int e_1 (int n){
        if (n == 1) return 1;
        return n * e_1(n-1);
     }
    public static int e_2 (int n){
        int prod = 1;
        for (var i = 1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }


     public static void main(String[] args) {
        System.out.println(a_1(3));
        // System.out.println(a_2(3));

        System.out.println(b_1(3));
        // System.out.println(b_2(3));

        System.out.println(c_1(5));
        // System.out.println(c_2(5));

        System.out.println(d_1(5));
        // System.out.println(d_2(5));

        System.out.println(e_1(5));
        // System.out.println(e_2(5));

    }
}
