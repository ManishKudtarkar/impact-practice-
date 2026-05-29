import java.util.*;
public class prac27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3= str + str2;
        System.out.println("Your name is " + str +'@'+ str2);
        System.out.println("Your age is " + str3);
        System.out.println(str.length());

        for (int i=0; i< str.length();i++){
            System.out.println(str3.charAt(i));
        }
    }
}
