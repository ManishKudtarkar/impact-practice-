import java.util.*;
public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        }else{
            if (a > b){
                System.out.println("Greater");
            System.out.println("Not Equal");
            }else{
                System.out.println("Smaller");
            }
        }
    }
}
