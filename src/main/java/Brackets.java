import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("()()()()()())(()"));
    }

    private static int isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(')
                stack.push(bracket);
            else if (((bracket == ']' || bracket == '}' || bracket == ')') && stack.isEmpty())
                    || ((bracket == ']' && stack.pop() != '[') || (bracket == '}' && stack.pop() != '{') || (bracket == ')' && stack.pop() != '(')))
                return 0;
            //stack.pop();
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
