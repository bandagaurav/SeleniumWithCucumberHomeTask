package Prep.Collections;

import java.util.Scanner;
import java.util.Stack;

public class HomeTask4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                if (isBalanced(line)) {
                    System.out.println(line + " is balanced");
                } else {
                    System.out.println(line + " is not balanced");

                }
            }
        }


    }

    private static boolean isBalanced(String line) {
        Stack<Character> stack = new Stack<>();
        for (Character c : line.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char brace = stack.pop();
                if ((c == '}' && brace != '{') ||
                        (c == ']' && brace != '[') ||
                        (c == ')' && brace != '(')) {
                    return false;
                }
            }


        }


        return stack.isEmpty();
    }
}
