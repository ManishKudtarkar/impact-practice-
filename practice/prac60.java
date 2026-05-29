import java.util.Scanner;

public class prac60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String str = sc.next(); // Taking a string to mimic "Madam"
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // Print the word, shortening it by one character each row
            for (int j = 0; j < n - i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
