import java.util.Scanner;
public class prac52 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.print("Enter marks");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Marks are :");

        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
