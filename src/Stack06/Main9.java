package Stack06;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Main9 {

    public static String solution(int decimal) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        while(decimal != 0) {

            int namuzi = 0;
            namuzi = decimal % 2;
            decimal /= 2;

            stack.push(Character.forDigit(namuzi, 10));
//          stack.push((char) namuzi + '0');
        }

        char[] arr = new char[stack.size()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(solution(13));;
    }
}
