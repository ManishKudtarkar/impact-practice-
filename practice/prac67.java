public class prac67 {
    public static void main(String[] args){
        int arr[]= {2 , 6 ,5, 3 , 4 , 6  , 7 , 1};
        int n = arr.length;
        int max =0;
        for (int i = 0; i < n - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
