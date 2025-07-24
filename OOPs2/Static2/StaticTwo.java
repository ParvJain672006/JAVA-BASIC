package OOPs2.Static2;

public class StaticTwo {
    static int a = 4;
    static int b;
    // this is how, we initialize static variables.

    static {
        System.out.println("I am the static block");
        // this block will only reuns when the 1st object is created or when the class is loaded for the 1st time.
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticTwo obj = new StaticTwo();
        System.out.println(StaticTwo.a + " " + StaticTwo.b);
        StaticTwo.b += 3;
        StaticTwo obj2 = new StaticTwo();
        System.out.println(StaticTwo.a + " " + StaticTwo.b);
    }
} 