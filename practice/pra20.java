import java.util.*;
public class pra20{
    public static int printmyname (int a , int b){
        // Scanner sc = new Scanner(System.in);
         //int n = sc.nextInt();
        int sum = a + b;
         return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = printmyname(a,b);
        System.out.println(result);
    }
}