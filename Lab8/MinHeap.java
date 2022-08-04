public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize + 1;
        this.size = 0;
        heap = new int[maxSize];
        heap[0] = -1;
    }

    private int getParentIndex (int i){
        return i/2;
    }

    private int getLeftChildIndex (int i){
        return 2*i;
    }

    private int getRightChildIndex (int i){
        return 2*i + 1;
    }

    public void insert(int element) {
        if(size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        size += 1;
        System.out.println("Inserting into index:  " + size);
        heap[size] = element;
        heapifyUp(size);
    }

    public int extractMin() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int root = heap[1];
        // System.out.println(heap[0]);
        heap[1] = heap[size];
        size--;
        heapifyDown(1);
        return root;
    }

    public void print (){
        for (int i = 0; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void heapifyUp(int i) {
        while(i > 1 && heap[getParentIndex(i)] > heap[i]){
            swap(getParentIndex(i), i);
            i = getParentIndex(i);
        }
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
     }

    public void heapifyDown(int i) {
        while(i <= size){
            int min = heap[i];
            int min_id = i;
            if(getLeftChildIndex(i) <= size && min > heap[getLeftChildIndex(i)]){
                min = heap[getLeftChildIndex(i)];
                min_id = getLeftChildIndex(i);
            }
            if(getRightChildIndex(i) <= size && min > heap[getRightChildIndex(i)]){
                min = heap[getRightChildIndex(i)];
                min_id = getRightChildIndex(i);
            }
            if(min_id != i){
                swap(min_id ,i);
                i = min_id;
            }
            else{
                break;
            }
        }
    }
}
