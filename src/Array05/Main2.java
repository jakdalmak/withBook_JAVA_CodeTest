package Array05;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main2 {

    public static int[] mySolution(int[] arr) {

        Set<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().toList());

        Integer[] setedArray = set.toArray(new Integer[0]);

        Arrays.sort(setedArray, Collections.reverseOrder());

        return Arrays.stream(setedArray).mapToInt(i -> i).toArray();
    }

    public static int[] bookSolution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result,Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 코드 시작 시간
        System.out.println(Arrays.toString(mySolution(new int[]{4, 2, 2, 1, 3, 4})));
        long endTime = System.currentTimeMillis(); // 코드 끝난 시간

        long durationTimeSec = endTime - startTime;
        System.out.println(durationTimeSec/ 1000.0 + "s by mySolution"); // 밀리세컨드 출력

        long startTime2 = System.currentTimeMillis(); // 코드 시작 시간
        System.out.println(Arrays.toString(bookSolution(new int[]{4, 2, 2, 1, 3, 4})));
        long endTime2 = System.currentTimeMillis(); // 코드 끝난 시간

        long durationTimeSec2 = endTime2 - startTime2;
        System.out.println(durationTimeSec2/ 1000.0 + "s by bookSolution"); // 밀리세컨드 출력
    }
}
