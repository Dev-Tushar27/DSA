package Heap;

import Heap.heapImplementation.MaxHeap;

public class heapSort {
    public static void main(String[] args) {
        int [] arr = {5,4,7,8,3,1,2,9};
        MaxHeap h = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            h.insert(arr[i]);
        }
        for (int j = 0; j < h.currSize(); j++) {
            System.out.print(h.remove()+" ");
        }
    }
}
