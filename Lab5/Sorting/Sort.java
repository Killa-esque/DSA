public class Sort {
    public static void selection (int a[]){
        for (int i = 0; i < a.length; i++){
            int min = i;
            for (int j = i+1; j < a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void insertion (int a[]){
        for (int i = 1; i < a.length; i++){
            int j = i;
            while (j > 0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void bubble (int a[]){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2,1,5,4,2,7,4,5,6,8,9,0};
        selection(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        insertion(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        bubble(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
