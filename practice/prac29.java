//Bubble sort

import java.util.*;

class sorting{
    public static void make (int arr[]) {
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 5, 3, 2, 4};
        for (int i = 0; i < arr.length-1; i++){
            for (int j=0; j<arr.length -1- i;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    
                }
            }
        }
        make(arr);
    }
}