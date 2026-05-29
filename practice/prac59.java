import java.util.Scanner;
public class prac59 {
    /*public static void main(String[] args){
        int arr[] = {0,1,0,3,12};
        int n = arr.length;
        System.out.println("Before moving zeroes: " + n);

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i= 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("After traversing: " + n);
    }
    
}
