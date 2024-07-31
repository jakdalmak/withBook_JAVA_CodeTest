package Stack06;

import java.util.Stack;

public class Main8 {

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') stack.push('(');
            else if(!stack.isEmpty() && ch == ')') stack.pop();
            else if(stack.isEmpty() && ch == ')') return false;

        }

        boolean result;

        if(stack.size() == 0) result = true;
        else result = false;



        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }
}
