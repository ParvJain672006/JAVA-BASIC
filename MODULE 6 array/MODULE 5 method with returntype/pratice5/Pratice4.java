//. Create an overloaded method to print a message with no parameters and with a String parameter.

public class Pratice4 {
    public static void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String args[]) {
        printMessage();
        printMessage("Hello, World!");
    }

};
