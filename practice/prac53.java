import java.util.Scanner;
public class prac53 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e[] = new int[n];
        int l[] = new int[n];
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            e[i] = sc.nextInt ();
            
            for (int i = 0; i < n; i++)
                l[i] = sc.nextInt ();
                
                int max = 0, sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += e[i] - l[i];
                max = Math.max (sum, max);
            }
        System.out.println (max);
    }
}
