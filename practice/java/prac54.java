import java.util.Scanner;
public class prac54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        if ( w >= 2 && w%2 ==0 && w>v) {
            int y = (w / 2) - v;
            int x = v - y;
            System.out.println( "TW ="+x + " "+"FW" + y);
        } else {
            System.out.println("invalid input");
        }
    }
}
