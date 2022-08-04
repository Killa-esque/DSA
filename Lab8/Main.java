import java.util.PriorityQueue;

public class Main {
    //Use extractMax function to heap sort
    public static void heapSort_Desc(int[] arr){
        MaxHeap heap = new MaxHeap(arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.extractMax();
        }
    }
    public static void heapSort_Asc(int[] arr){
        MinHeap heap = new MinHeap(arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.extractMin();
        }
    }

    public static void main(String[] args) {
        //MAX HEAP
        // MaxHeap heap = new MaxHeap(10);
        // heap.insert(1);
        // heap.insert(2);
        // heap.insert(3);
        // heap.insert(4);
        // heap.insert(5);
        // heap.insert(6);
        // heap.insert(7);
        // heap.insert(8);
        // heap.insert(9);

        //Use extract max to heap sort in descending order
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // heapSort_Desc(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        //MIN HEAP
        // MinHeap minHeap = new MinHeap(10);
        // minHeap.insert(1);
        // minHeap.insert(2);
        // minHeap.insert(3);
        // minHeap.insert(4);
        // minHeap.insert(5);
        // minHeap.insert(6);
        // minHeap.insert(7);

        //Use extract min to heap sort in acscending order
        // int[] arr2 = {9,2,1,4,2,3,6,7,8};
        // heapSort_Asc(arr2);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i] + " ");
        // }

        //Priority Queue to queue some people in the queue
        PriorityQueue<String> queue = new PriorityQueue<String>();
        MaxHeap heap2 = new MaxHeap(10);
        queue.add("(Alex,3");
        queue.add("(Bob,2");
        queue.add("(David,6");
        //Define the priority queue to queue some people. A person has name and priority number. Given that: higher priority = higher number.
        //Use extractMax function to heap sort the people in the queue.
        while(!queue.isEmpty()){
            String person = queue.poll();
            heap2.insert(Integer.parseInt(person.substring(person.indexOf(",") + 1)));
        }
        while(!heap2.isEmpty()){
            System.out.print(heap2.extractMax() + " ");
        }



    }
}
