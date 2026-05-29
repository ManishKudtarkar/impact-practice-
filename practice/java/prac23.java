import java.util.Scanner;
public class prac23 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num = new int[100];
            
        for (int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int  i = 0; i < size; i++){
            if (num[i] == x){
            System.out.println("x found at int : " + i);
            }
        }
    }
}
