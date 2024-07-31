package Array05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static int[] solution(int[] answers) {
        int[][] supoja = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int[] scoreArr = new int[3];

        for(int i = 0; i < 3; i++) {
            int supoIndex = 0;
            for(int j = 0; j < answers.length; j++) {
                // 나머지 연산부분 오답노트하기
                if(supoIndex != 0 && supoIndex % supoja[i].length == 0) supoIndex = 0;

                if(supoja[i][supoIndex] == answers[j]) scoreArr[i] += 1;
                System.out.println(i + "번쨰 supoja" + supoja[i][supoIndex] + " : " + answers[j]);
                supoIndex++;
            }
        }

        List<Integer> resultList = new ArrayList<>();

        int max = Arrays.stream(scoreArr).max().getAsInt();
        System.out.println("max == " + max);
        for(int i = 0; i < 3; i++) {
            if(max == scoreArr[i]) resultList.add(i+1);
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
    }
}
