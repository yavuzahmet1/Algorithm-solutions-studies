import java.util.Stack;

public class ValidParenthess {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (currentChar == '(' || currentChar == '{' || currentChar == '[')
                stack.push(currentChar);
            else if (currentChar == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (currentChar == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (currentChar == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("({]})"));
    }
}
