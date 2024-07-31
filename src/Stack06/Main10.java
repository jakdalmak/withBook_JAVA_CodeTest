package Stack06;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Main10 {

    public static int solution(String s) {

        if(s.length() % 2 == 1) return 0;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int basicLength = s.length();
        int result = 0;
        s += s;
        System.out.println(s);

        for(int i = 0; i < basicLength; i++) {

            ArrayDeque<Character> stack = new ArrayDeque<>();

            char chr = '.';
            int stackCount = 0;

            // 회전하지 않은 상태에서도 검증 수행하여야 함.
            for(int k = i; k < basicLength + i; k++) {
                chr = s.charAt(k);
                System.out.println(i +" "+ chr + " " + k);
                if(chr == '(' || chr == '{' || chr == '[') {
                    stackCount++;
                    stack.push(chr);
                }
		        else {
                    // 해당 if문 true인 경우 for문 다음 루프 수행하여야 함.
                    if(stack.isEmpty() || stack.pop() != map.get(chr)) {
                        break;
                    }
                }
            }
            // 1. 스택이 비어있으며,
            // 2. 비어있는 스택은 기존에 한 번이라도 값이 삽입되었어야 함. => 3번에 통합
            // 3. 문자열 내의 열림 괄호가 모두 스택에 삽입되었어야 함.
            if(stack.isEmpty() && stackCount == basicLength/2) result++;
            System.out.println(i + " " + result);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(solution("}]()[{"));
    }
}
