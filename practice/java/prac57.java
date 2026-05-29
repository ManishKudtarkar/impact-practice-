public class prac57 {
    //armstrong number 
    public static void main(String[] args) {
        int num = 24; 
        int nums = num;
        int sum = 0;

        int temp = num;
        int digits = 0;
        for (int i = 0; temp > 0; i++) {
            digits++;
            temp /= 10;
        }

        while (num > 0) {
            int digit = num % 10; 
            sum += Math.pow(digit, digits); 
            num /= 10; 
        }
    

        if (sum == nums) { 
            System.out.println(nums + " is an Armstrong number.");
        } else {
            System.out.println(nums + " is not an Armstrong number.");
        }
    }
    
}
