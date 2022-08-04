import java.util.Arrays;
public class Sorting <E extends Comparable<E>> implements InterfaceSorting<E> {
    private E[] arr  = null;
    private int size = 0;

    public Sorting(E[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
    public int size (){return size;}

    @Override
    public void select() {
        for (var i = 0; i < arr.length - 1; i++) {
            var min = i;
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            E temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void mergeSort(int start, int end)
    {
        //Base case
        if (start < end)
        {
            //get middle point
            int middle = (start + end) / 2;

            mergeSort(start, middle); //conquer strategy to the left
            mergeSort(middle + 1, end);  // conquer strategy to the right

            // Merge the two parts
            merge(start, middle, end);
        }
    }

    public void merge(int start, int middle, int end)
    {
        E[] leftArray  = (E[]) new Comparable[middle - start + 1];
        E[] rightArray = (E[]) new Comparable[end - middle];

        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = arr[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = arr[middle + 1 + i];

        /* Merge the temp arrays */

        // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        // compare each index of the subarrays adding the lowest value to the currentIndex
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                arr[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                arr[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // copy remaining elements of leftArray[] if any
        while (leftIndex < leftArray.length) arr[currentIndex++] = leftArray[leftIndex++];

        // copy remaining elements of rightArray[] if any
        while (rightIndex < rightArray.length) arr[currentIndex++] = rightArray[rightIndex++];
    }



    @Override
    public void bubble() {
        boolean swapped = false;
        for (var i = 0; i < arr.length; i++) {
            swapped = false;
            for (var j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

    }
    @Override
    public void insert() {
        for (var i = 1; i < arr.length; i++) {
            var j = i;
            while (j > 0 && arr[j].compareTo(arr[j - 1]) < 0) {
                E temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
    @Override
    public void quick(int left, int right) {
        //Base case
        if (left < right){
            int p_i = partition(left,right);
            quick(left,p_i-1);
            quick(p_i+1,right);
        }
    }
    public int partition(int left, int right){
        // pivot
        E pivot = arr[right];
        // Index of smaller element and indicates the right position of pivot found so far
        int i = (left - 1);
        for(int j = left; j <= right - 1; j++){
            // If current element is smaller than the pivot
            if (arr[j].compareTo(pivot) < 0){
                // Increment index of smaller element
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, right);
        return (i + 1);
    }

    public void swap(int i, int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public void heap() {


    }
    @Override
    public void radix() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "       + Array: " + Arrays.toString(arr);
    }

}