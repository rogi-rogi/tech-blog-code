package pl.java.stringswitch;

public class StringSwitchExample {
    public static void main(String[] args) {
        String A = "Hello";

        switch (A) {
            case "Hello":
                System.out.println("Hi!");
                break;
            case "Hello World":
                System.out.println("Hello World");
                break;
            default:
                System.out.println("who are you?");
        }
    }
}