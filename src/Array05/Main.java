package Array05;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] ArraysSort(int[] array) {
        int[] arr = array;

        Arrays.sort(arr);

        return arr;
    }

    public static int[] bubbleSort(int[] array) {
        int[] arr = array;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(bubbleSort(new int[] {1, -5, 2, 4, 3,2,3,5,3,234,2,6,7,7,12,3,23,5,46,512,3,1245,67,7,34,534,564,57,568,23,41,24,267,8,67,346,23,5,4})));
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        System.out.println(Arrays.toString(ArraysSort(new int[] {1, -5, 2, 4, 3,2,3,5,3,234,2,6,7,7,12,3,23,5,46,512,3,1245,67,7,34,534,564,57,568,23,41,24,267,8,67,346,23,5,4})));
        end = System.currentTimeMillis();
        System.out.println((end-start) / 1000.0 + "초");
    }
}