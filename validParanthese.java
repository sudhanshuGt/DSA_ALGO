import java.util.Stack;

public class validParanthese {

    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    // Push opening brackets onto the stack
                    stack.push(c);
                    break;
                case ')': 
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default: 
                    break;
            }
        }
 
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String paString = "{[]}";

        System.out.println(isValid(paString));
    }
}
