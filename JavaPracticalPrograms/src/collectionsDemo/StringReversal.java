package collectionsDemo;

public class StringReversal {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();

        for (int start = 0, end = charArray.length - 1; start < end; start++, end--) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
        }

        return new String(charArray);
    }
}
