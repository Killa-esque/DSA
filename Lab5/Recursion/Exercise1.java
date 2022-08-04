public class Exercise1{
    public static double prod_recur(int a, int b){
        if (a>0 && b<0) return prod_recur(b, a);
        else if (a<0 && b<0) return prod_recur(-1*a, -1*b);
        if (a>b) return prod_recur(b, a);
        if (b == 0) return 0;
        return a + prod_recur(a, b-1);
    }
    public static int count (int n){
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int bin2dec(String n, int i){
        int size = n.length();
        if (i == size-1 ) return n.charAt(i) - '0';
        return ((n.charAt(i) - '0') << (size-i-1)) + bin2dec(n, i+1);
    }

    public static int maxDigit(int n){
        if (n<0) return maxDigit(-1*n);
        if (n==0) return 0;
        if (n%10>maxDigit(n/10)) return n%10;
        return maxDigit(n/10);
    }
    public static int maxElement (int a[], int n){
        int max;
        if (n == 1){
            max = a[0];
            return max;
        }
        return max = a[n-1] > maxElement(a,n-1) ? a[n-1] : maxElement(a,n-1);
    }
    public static int search(int[] a, int n, int key){
        if (n == 0 && a[0] == key){
            return 0;
        }
        return key == a[n-1] ? n-1 : search(a, n-1, key);

    }
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5,6,7,11,9,10};
        // int[] a = {6, 2, 9, 3};
        // System.out.println(prod_recur(3, -3));
        // System.out.println(bin2dec("1010", 0));

        // System.out.println(maxDigit(-6543));
        // System.out.println(maxElement(a, a.length));
        // System.out.println(search(a,  a.length, 11));
        System.out.println(prod_recur(3,5));
        System.out.println(bin2dec("1000", 0));
        System.out.println(maxDigit(1234));
        int[] a = {6, 2, 9, 3};
        System.out.println(maxElement(a, a.length));
        System.out.println(search(a, a.length, 9));

    }
}