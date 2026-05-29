public class prac37 {
    public static void TOH(int n, char src, char dest, char helper){
        if (n==0){
            return;
        }
        TOH(n-1, src,dest,helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        TOH(n-1, helper, src, dest);
    }

    public static void main (String [] args){
        int n = 2;
        TOH(n, 'A', 'C', 'B');
       }
    
}
