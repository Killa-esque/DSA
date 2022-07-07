public class Exercise6 {
    public static int findMin (int[] arr, int length){
        int min = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int sum (int[] arr, int length){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int countEven (int[] arr, int length){
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Min of array: " + findMin(arr,arr.length));
        System.out.println("Sum of array: " + sum( arr,arr.length));
        System.out.println("Number of even element: " + countEven(arr,arr.length));
    }
}
