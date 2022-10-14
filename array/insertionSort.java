package array;
import java.util.*;
public class insertionSort{
    public static void sort(int [] arr, int n){
        for(int i=1; i<n;i++){
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =curr;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i< 10; i++){
            arr[i] = scn.nextInt();
        }

        sort(arr, 10);
        
        for(int i = 0; i< 10; i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();
    } 
}