public class Practice {
    public static void bubble (int[] a){
        boolean flag = false;
        for (var i = 0; i<a.length; i++){
            flag = false;
            for (var j = 0; j<a.length - i - 1; j++){
                if (a[j+1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (flag != true){
                break;
            }
        }
    }

    public static void selection (int[] a){
        for (int i = 0; i<a.length - 1; i++){
            int min = i;
            for (int j = i + 1; j<a.length; j++){
                if (a[j] > a[min]){
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }

    public static void insertion (int[] a){
        for (int i = 1; i<a.length; i++){
            int j = i;
            while (j>0 && a[j] > a[j-1]){
                int tmp = a[j-1];
                a[j-1] = a[j];
                a[j] = tmp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {134,564,231,51,655,123,5};
        // bubble(a);
        // selection(a);
        insertion(a);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
