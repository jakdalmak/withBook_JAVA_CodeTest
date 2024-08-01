package Stack06;

import java.util.ArrayDeque;

public class Main11 {

    public static int solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        int result = 0;

        for(char c : s.toCharArray()) {
            if(stack.isEmpty()) stack.push(c);
            else {
                if(stack.peek() == c) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }

        if(stack.isEmpty()) result = 1;

        return result;

    }

    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }
}
