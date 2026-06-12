public class prac70 { 
    public static void conquer(int arr[], int si , int mid , int ei){ 
        int merged[] = new int [ei - si + 1]; 
        int idx1 = si; 
        int idx2 = mid + 1; 
        int x = 0; 
        
        while (idx1 <= mid && idx2 <= ei){ 
            if (arr[idx1] <= arr[idx2]){ 
                merged[x++] = arr[idx1++]; 
            } else { 
                merged[x++] = arr[idx2++]; 
            } 
        } 
        
        // BUG FIX 1: Copy remaining elements of the first sorted half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        
        // BUG FIX 2: Copy remaining elements of the second sorted half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged elements back to the original array 
        for (int i = 0; i < merged.length; i++) { 
            arr[si + i] = merged[i]; 
        } 
    } 

    public static void divide(int arr[] , int si , int ei) { 
        if (si >= ei){ 
            return; 
        } 
        int mid = si + (ei - si) / 2; 
        divide(arr, si , mid); 
        divide(arr, mid + 1 , ei); 
        conquer(arr, si, mid, ei); 
    } 

    public static void main(String[] args){ 
        int arr[] = {6 ,4,8,2,0,1}; 
        int n = arr.length; 
        divide(arr, 0, n-1); 
        System.out.println("Sorted array:"); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
}
