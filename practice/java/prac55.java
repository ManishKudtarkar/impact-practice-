public class prac55 {
    public static void main(String[] args) {
        class human{
            String color;
            void eat(){
                System.out.println("eating");
            }
        }
        class dharam extends human{
            void walk(){
                System.out.println("walking");
            }
        }
        class meow extends dharam{
            void meow(){
                System.out.println("meow");
            }
        }
        dharam d = new dharam();
        d.eat();
        d.walk();
        System.out.println(d.color);
        meow m = new meow();
        m.meow();
        m.eat();
        m.walk();
    }
}

