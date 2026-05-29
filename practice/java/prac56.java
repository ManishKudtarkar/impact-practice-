public class prac56 {
    public static void main(String[] args) {
        // Defining local class manish
        class manish {
            int age;
            void display() {
                System.out.println("Age: " + age);
            }
            void print() {
                System.out.println("Printing...");
                for (int i = 0; i <= 15; i++) {
                    System.out.println(i);
                }
            }
        }

        // Define jack to fix inheritance error
        class jack {
            void sayHello() {
                System.out.println("Hello from Jack");
            }
        }

        // Defining local class seo extending jack
        class seo extends jack {
            void dis() {
                System.out.println("This is seo class");
            }
        }

        // --- Usage ---
        manish m = new manish();
        m.age = 25;
        m.display();
        m.print();

        seo s = new seo();
        s.dis();
        s.sayHello(); // Inherited method
    }
}
