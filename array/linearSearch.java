package array;

import java.util.Scanner;

public class linearSearch {
    static int search(int [] arr, int ele){
        for (int i = 0 ; i< arr.length; i++) {
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr =  new int[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the number to be found:");
        int m = scn.nextInt();
        int pos = search(arr,m);
        if(pos != -1){
            System.out.println("Element found at:"+pos);
        }
        else {
            System.out.println("Element not found!!!");
        }
        scn.close();
    }
}
