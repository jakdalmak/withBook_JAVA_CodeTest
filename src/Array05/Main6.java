package Array05;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 풀이 실패에 따른 다음 챕터 진행 */
public class Main6 {

    public static int[] solution(int N, int[] stages) {
        // stages.length == 본 게임의 전체 유저 수

        Map<Integer, Double> stageFailureMap = new HashMap<>();

        int[] stageUsers = new int[N+2]; // int[] 는 내부값 자동으로 0으로 초기화

        // stageUsers는 index == 스테이지, value == 스테이지 잔류 인원의 값을 지니는 배열이 된다.
        for(int i = 1; i < stages.length; i++) {
            stageUsers[stages[i]] += 1;
        }

        double previousUsers = 0;
        for(int j = 1; j <= N; j++) {
            if(stageUsers[j] == 0) {
                stageFailureMap.put(j, 0.0);
                continue;
            }
            double failure = stageUsers[j] / ((double)stages.length - previousUsers);
            previousUsers += stageUsers[j];
            stageFailureMap.put(j, failure);
        }

        return stageFailureMap.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] {2,1,2,6,2,4,3,3})));
    }
}
