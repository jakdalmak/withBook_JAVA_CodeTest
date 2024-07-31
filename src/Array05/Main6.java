package Array05;

import java.util.*;

/** 풀이 실패에 따른 다음 챕터 진행 */
public class Main6 {

    public static int[] solution(int N, int[] stages) {
        int[] result = new int[N];
        Map<Float, Integer> stageMap = new HashMap<>();
        Float[] failPercentArr = new Float[N];


        for(int i = 0; i < N; i++) {
            int stage = i+1;
            int herePlayer = (int) Arrays.stream(stages)
                    .filter(m -> m == stage).count(); // 현재 스테이지 잔류 인원

            int reachPlayer = (int) Arrays.stream(stages)
                    .filter(m -> m >= stage).count(); // 현재 스테이지 총 도달 인원

            float failPercent;
            if (herePlayer == 0) failPercent = 0;
            else failPercent = (float)herePlayer / (float)reachPlayer;


            stageMap.put(failPercent, i);
            failPercentArr[i] = failPercent;
        }

        Object[] sortedArr = Arrays.stream(failPercentArr)
                        .sorted((o1,o2) -> Float.compare(o2, o1)).toArray();
        // 문제 보기 시작한 7시 13분 ~ 이부분 까지 완료 7시 42분
        System.out.println(stageMap.keySet());
        System.out.println(Arrays.toString(sortedArr));

        for(int i = 0; i < sortedArr.length; i++) {
            int stage = stageMap.get((float) sortedArr[i]);
            result[i] = stage;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
