
public class prac65 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Second largest element: " + second(arr));
    }
public static int second(int arr[]) {
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}
}