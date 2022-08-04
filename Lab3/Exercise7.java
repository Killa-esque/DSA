public class Exercise7 {
    public static int findMin (int[] arr, int length){
        int min = 0;
        if (length == 1) {
            return arr[0] < min ? arr[0] : min;
        }
        return min = Math.min(arr[0], findMin(arr, length - 1));

    }
    public static int sum (int[] arr, int length){
        if (length == 0) return 0;
        return arr[length-1] + sum(arr, length - 1);
    }
    public static int countEven (int[] arr, int length){
        if (length == 0) return 0;
        if (arr[length-1] % 2 == 0) return 1 + countEven(arr, length - 1);
        return countEven(arr, length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,7,8,9,10};
        System.out.println("Min of array: " + findMin(arr,arr.length));
        System.out.println("Sum of array: " + sum( arr,arr.length));
        System.out.println("Number of even element: " + countEven(arr,arr.length));
    }

}
