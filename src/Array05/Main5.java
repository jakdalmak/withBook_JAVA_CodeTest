package Array05;

import java.util.Arrays;

public class Main5 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++) {

            // 이 이중 for문 내에서 행렬 한 줄 구하기 + 점곱 구현하기
            for(int j = 0; j < arr2[0].length; j++){
                for(int k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }


        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(
                solution(
                        new int[][]{{1, 4}, {3, 2}, {4, 1}},
                        new int[][]{{3, 3}, {3, 3}}
                ))
        );
    }
}
