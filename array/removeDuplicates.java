package array;

import java.util.Scanner;

public class removeDuplicates {
    static int remove(int[] arr) {
        int n = arr.length;
        int k = 0;
        for(int i = 0; i< n-1;i++){
            if(arr[i] != arr[i+1]){
                arr[k++] = arr[i];
            }
        }
        arr[k++] = arr[n-1];
        return k;
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = remove(arr);
        for (int  i = 0; i < k; i++){
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
}
