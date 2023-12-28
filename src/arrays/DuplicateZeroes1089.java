package arrays;

import java.util.Arrays;

public class DuplicateZeroes1089 {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 0, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(duplicateZeros(array)));
    }

    public static int[] duplicateZeros(int[] arr) {
        if (arr[arr.length - 2] == 0) {
            arr[arr.length - 1] = 0;
        }
        for (int i = arr.length - 3; i >= 0; i--) {
            if (arr[i] == 0) {
                shift(arr, i);
            }
        }
        return arr;
    }
    public static void shift(int[] arr, int indexOfZero){
        for (int i = arr.length-1; i > indexOfZero; i--) {
            arr[i] = arr[i-1];
        }
    }
}
