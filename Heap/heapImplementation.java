package Heap;

public class heapImplementation {
    public static class MaxHeap{
        int []heap;
        int heapSize;
        int maxSize;


        //constructor
        MaxHeap(int size){
            heapSize = 0;
            maxSize = size;
            heap = new int[size];
        }

        int lChild(int i){      //left child
            return (2*i +1);
        }
        int rChild(int i){      //right child
            return (2*i +2);
        }
        int parent(int i){      //parent
            return (i-1)/2;
        }
        int getMax(){
            return heap[0];
        }
        int currSize(){
            return heapSize;
        }
        void displayHeap(){
            for (int j = 0; j < heapSize; j++) {
                System.out.print(heap[j]+" ");
            }
        }
        void insert(int val){
            if(heapSize == maxSize){
                System.out.println("Overflow!!!!");
                return;
            }
            heapSize++;
            int i = heapSize -1;
            heap[i] = val;
            while(i!=0 && heap[i] > heap[parent(i)]){
                int temp = heap[parent(i)];
                heap[parent(i)] = heap[i];
                heap[i] = temp;
                i = parent(i);
            }
        }
        int remove(){
            if(heapSize<0){
                System.out.println("Underflow!!!!");
                return Integer.MIN_VALUE;
            }
            if(heapSize == 1){
                heapSize--;
                return heap[heapSize];
            }
            int root = heap[0];
            heap[0] = heap[heapSize-1];
            heapSize--;
            MaxHeapify(0);
            return root;
        }

        void MaxHeapify(int i){
            int l = lChild(i);
            int r = rChild(i);
            int largest = i;

            if(l < heapSize && heap[l]>heap[i]){
                largest = l;
            }
            if(r < heapSize && heap[r]>heap[i]){
                largest = r;
            }
            if(largest != i){
                int temp = heap[i];
                heap[i] = heap[largest];
                heap[largest] = temp;
                MaxHeapify(largest);
            }
        }
        
        void increaseKey(int i, int newVal){
            heap[i] = newVal;
            while(i!=0 && heap[i] > heap[parent(i)]){
                int temp = heap[parent(i)];
                heap[parent(i)] = heap[i];
                heap[i] =temp;
                i = parent(i);
            }
        }
        void deleteKey(int i){
            increaseKey(i, Integer.MAX_VALUE);
            remove();
        }
        
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(8);
        h.insert(3);
        h.insert(4);
        h.insert(2);
        h.insert(5);
        h.insert(10);
        h.insert(7);
        h.insert(9);
        h.insert(8);
        h.displayHeap();
        System.out.println();
        while(h.currSize() != 0){
            System.out.print(h.remove()+" ");
        }
    }
}
