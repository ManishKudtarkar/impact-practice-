import java.util.Arrays;

public class prac71 {
    public static void main(String[] args) {
        String[] str = {"Flow", "Flow", "flight"};
        if (str == null || str.length == 0) {
            System.out.println("");
            return;
        }
        Arrays.sort(str);

        String f_ele = str[0];               // "Flow"
        String l_ele = str[str.length - 1];  // "flower"
        
        int i = 0;
        while (i < f_ele.length() && i < l_ele.length()) {
            if (f_ele.charAt(i) == l_ele.charAt(i)) {
                i++;
            } else {
                break; // Stop at the first mismatch
            }
        }

        // 4. Print the matching substring
        System.out.println("Longest Common Prefix: " + f_ele.substring(0, i));
    }
}