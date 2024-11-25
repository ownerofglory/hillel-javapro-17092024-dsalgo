package ua.ithillel.dsalgo.util;

import java.util.Stack;

public class StringUtil {
    // "Hello" -> "olleH"
    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    // "a" -> "a"
    // "s" -> "s"
    // "" -> ""

    // "Hello": "o" + reverse("Hell")
    // "Hell": "l" + reverse("Hel")
    // "Hel": "l"+ reverse("He") = "l" + "e" + "H" + ""
    // "He": "e"+ reverse("H") = "e" + "H" + ""
    // "H": "H"+ reverse("") = "H"+ ""
    // "" :  return ""

    // "anna":
    public static String reverseStringRec(String str) {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }

        // base case 2
        // if (isPalindrome(str)) {
        //  return str;
        //}

        // recursive case
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + reverseString(str.substring(0, str.length() - 1));
    }

    public static String reverseStringStack(String str) {
        Stack<Character> stack = new Stack<>(); // FILO, LIFO
        for (Character c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
