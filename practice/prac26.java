import java.util.*;

public class prac26{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        //inputting values in 2D array
        for (int i=0; i < rows ; i++){
            for (int j=0; j < cols ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i <rows;i++){
            for(int j = 0; j< cols;j++){
                if (arr[i][j] == x){
                    System.out.println("x found at int : " + i + " " + j);
                }
            }
        }
    }
}