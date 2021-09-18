package Week_1;


public class ReverseString {
    public static void main(String [] args) {

        // Write a function that reverses a string.
        // Example:
        // Input: "hello"
        // Output: "olleh"

        String x = "hello";
        System.out.println(reverseStringMine(x) + "\n\n");
        System.out.println(reverseStrBldr(x) + "\n\n");
        System.out.println(reverseStrBffr(x) + "\n\n");

    }


    // Mine O(n) tine and space || NANO TIME: 14500
    public static String reverseStringMine(String word) {
        long time = System.nanoTime();
        String reversedWord = "";
        for(int i  = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(System.nanoTime() - time);
        return reversedWord;
    }

    // O(n) tine || NANO TIME: 3900
    public static String reverseStrBldr(String word) {
        long time = System.nanoTime();
        StringBuilder sb = new StringBuilder(word);
        System.out.println(System.nanoTime() - time);
        return sb.reverse().toString();
    }

    // Mine O(n) tine || NANO TIME: 59100
    public static String reverseStrBffr(String word) {
        long time = System.nanoTime();
        StringBuffer sb = new StringBuffer(word);
        System.out.println(System.nanoTime() - time);
        return sb.reverse().toString();
    }



} 