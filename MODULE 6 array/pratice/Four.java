package pratice;

// Create a program to convert a String to lowercase and check if it contains
// "java" using contains().

//Write a method that takes a String array and returns the longest string

public class Four {
    public static String findLongestString(String[] arr) {
        String longest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }
        return longest;
    }

    public static void main(String args[]) {
        String[] words = {"apple", "banana", "orange", "kiwi"};
        String longest = findLongestString(words);
        System.out.println("Longest string is: " + longest);
    }
}
