package array;

import java.util.Scanner;

public class selectionSort {
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
    static void print(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("original array:");
        print(arr);
        System.out.println();
        sort(arr);
        System.out.print("Sorted Array:");
        print(arr);
        scn.close();
    }
}
