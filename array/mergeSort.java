package array;
import java.util.Scanner;

public class mergeSort {
    static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid+1 - start;
        int n2 = end - mid;
        int [] a = new int[n1];
        int [] b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = arr[start+i];
        }
        for (int i = 0; i < n2; i++) {
            b[i] = arr[mid+i+1];
        }

        int  i = 0, j = 0 , k = start;
        while(i<n1 && j<n2){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;k++;
            }else if(a[i] > b[j]){
                arr[k] = b[j];
                j++;k++;
            }
        }
        while(i < n1){
            arr[k] = a[i];
            i++;k++;
        }
        while(j < n2){
            arr[k] = b[j];
            j++;k++;
        }

    }
    static void sort(int [] arr, int start, int end){
        if(start< end){
            int mid = (start+end)/ 2;
            sort(arr, start, mid);
            sort(arr,mid+1, end);
            merge(arr, start, mid,end);
        }

    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i< 5; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array:");
        for(int i = 0; i< 5; i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();

    }
}
