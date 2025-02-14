package sorting;

import java.util.Arrays;

public class SortExamScores {
    public static void main(String[] args) {
        int[]examScore={98,67,78,58,86,78};
        selectionSort(examScore);
        System.out.println(Arrays.toString(examScore));
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first = i;
            int min = getMin(arr, first, arr.length - 1);
            swap(arr, min, first);
        }
    }

    static void swap(int[] arr, int min, int first) {
        int tmp = arr[min];
        arr[min] = arr[first];
        arr[first] = tmp;
    }

    static int getMin(int[] arr, int s, int last) {
        int min = s;
        for (int i = s; i <= last; i++) {
            if (arr[min] > arr[i]) min = i;
        }
        return min;
    }
}
