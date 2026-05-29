import java.util.Arrays;

public class prac61 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        System.out.println("After full reverse: " + Arrays.toString(arr));

        // Step 2: Reverse the first k elements
        int k = 3;
        reverse(arr, 0, k - 1);
        System.out.println("After reversing first k: " + Arrays.toString(arr));

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
        System.out.println("Final Result: " + Arrays.toString(arr));
    }

    // Helper method to reverse a specific portion of an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
