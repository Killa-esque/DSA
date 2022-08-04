public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
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

    public int extractMax() {
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
        while(i > 1 && heap[getParentIndex(i)] < heap[i]){
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
            int max = heap[i]; //22  ;22 ; 22
            int max_id = i; //1 ; 2; 4
            if(getLeftChildIndex(i) <= size && max < heap[getLeftChildIndex(i)]){ // 2<=size && 22<=73 ; 2<=size && 22<=36; 2<=size && 22<=36
                max = heap[getLeftChildIndex(i)]; // max = 73 ; max = 36
                max_id = getLeftChildIndex(i); // max_id = 2 ; max_id = 4
            }
            if(getRightChildIndex(i) <= size && max < heap[getRightChildIndex(i)]){ // 3<=size && 73 <= 60 (flase); 3<=size && 36 <= 35 (flase)
                max = heap[getRightChildIndex(i)];
                max_id = getRightChildIndex(i);
            }
            if(max_id != i){ // 2 != 1; 4 != 2
                swap(max_id ,i); // swap(2,1) = swap(73,22); swap(4,2) = swap(36,22)
                i = max_id; // i = 2; i = 4
            }
            else{
                break;
            }
        }
    }

}

