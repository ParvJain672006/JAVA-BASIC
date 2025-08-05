package BASICCC;

public class StringIntroImmutable {
    public static void main(String[] args) {
        String name = "Parv";
        String greeting = "Hello";
        String combined = greeting + " " + name;

        System.out.println(combined);

        String original = "Java";
        String changed = original.concat(" Programming");
        System.out.println("Original: " + original);
        System.out.println("Changed: " + changed);
    }
}

// String is a sequence of characters.
// Strings in Java are immutable.
// When you change a string, a new object is created.
// The original string remains unchanged.
// concat() and + create new strings, not modify the old
