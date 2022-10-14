package array;
import java.util.Scanner;

public class bubbleSort {
    public static void sort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = 0; j< n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i< 5; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
        System.out.println("Sorted Array:");
        for(int i = 0; i< 5; i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
}
