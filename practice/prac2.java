public class prac2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "Tony";
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Hello, " + name + "!");
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        int mul = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is " + mul);
        int ans = a*b/a-b;
        System.out.println("The answer is " + ans);
        int ans2 = (a*b)/(a-b);
        System.out.println("The answer is " + ans2);
    }
}
