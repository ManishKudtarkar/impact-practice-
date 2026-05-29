public class prac66 {
    public static void main(String[] args) {
        //reverse an array by checking index from end to start
        int arr[] = {1, 2, 4, 6 , 8 ,10};
        int n = arr.length;
        
        while (n > 0) {
            System.out.print(arr[n - 1] + " ");
            n--;
        }
    }
    
}
