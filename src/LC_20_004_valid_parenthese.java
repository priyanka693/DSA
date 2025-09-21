import java.util.Stack;

public class LC_20_004_valid_parenthese {

    public static void main(String[] args) {
       String Input= "()[]}";
        System.out.println(isValid(Input));
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() !=c) {
                return false;
            }
        }


        return stack.isEmpty();
    }
}
