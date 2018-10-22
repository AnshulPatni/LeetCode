import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                if(c == ')') {
                    if(stack.peek().equals('('))
                        stack.pop();
                    else
                        return false;
                } else if(c == '}') {
                    if (stack.peek().equals('{'))
                        stack.pop();
                    else
                        return false;
                } else if(c == ']') {
                    if (stack.peek().equals('['))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
