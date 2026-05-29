public class prac0 {
    public static void main (String[] args){
        int arr [] = {5 , 41, 1  , 3, 2};
        for (int i =0; i < arr.length -1; i++){
            int smallest = i;
            for (int j = i + 1; j< arr.length; j++){
                if (arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
        }
        System.err.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }  
}
