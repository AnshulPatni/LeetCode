import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c")); //true
        System.out.println(backspaceCompare("ab##", "c#d#")); //true
        System.out.println(backspaceCompare("a##c", "#a#c")); //true
        System.out.println(backspaceCompare("a#c", "b")); //true
    }

    public static boolean backspaceCompare(String S, String T) {
        return createNewString(S).equals(createNewString(T));
    }

    public static String createNewString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c != '#')
                stack.push(c);
            else if(!stack.empty())
                stack.pop();
        }
        return stack.toString();
    }
}
