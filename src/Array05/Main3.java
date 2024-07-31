package Array05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {


    public static int[] solution(int[] numbers) {
            List<Integer> answer = new ArrayList<>();

            for(int i = 0; i < numbers.length - 1; i++) {
                for(int j = i + 1; j < numbers.length; j++) {
                    int sum = numbers[i] + numbers[j];
                    answer.add(sum);
                }
            }

            int[] answerArr = answer.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();

            return answerArr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
    }
}
