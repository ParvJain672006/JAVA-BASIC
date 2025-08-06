package BASICCC;

public class CharAtLengthString {
    public static void main(String[] args) {
        String favQuote = "Dream big, work hard!";
        System.out.println("My favourite quote: " + favQuote);

        int length = favQuote.length();
        System.out.println("Total characters: " + length);

        System.out.print("Characters at even positions: ");
        for (int i = 0; i < favQuote.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(favQuote.charAt(i) + " ");
            }
        }
        System.out.println();

        char lastChar = favQuote.charAt(favQuote.length() - 1);
        System.out.println("Last character: " + lastChar);
    }
}

// charAt(index) gives the character at a specific position in the string.
// length() returns the total number of characters in the