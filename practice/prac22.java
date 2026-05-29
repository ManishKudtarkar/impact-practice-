import java.util.*;

public class prac22 {
    public static void factorial(int n){
        if (n < 0){
            System.out.println("Invalid input");
            return;
            
        }
        int result = 1;
        for (int i = n; i > 1; i--){
            result = result * i;
        }
        System.out.println(result);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
    
}
