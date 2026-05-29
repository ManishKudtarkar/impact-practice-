import java.util.*;
public class prac35 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String n = sc.nextLine();
        for (int i =0 ; i<n.length();i++){
            for (int j=0;j<=i;j++){
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }   
}
