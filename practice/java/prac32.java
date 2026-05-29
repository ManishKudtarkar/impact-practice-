import java.util.*;
/* 
public class prac32{
    public static void ponum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        ponum (n+1);
    }*/
public class prac32{
    public static void ponum(int i , int n , int sum){
        if (i==n){
            System.out.println(sum);
            return;

        }
        sum += i;
        ponum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        ponum(1, 8, 0);
    }   
}