package arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        if (nums.length == 1){
            return new int[] {calcSquare(nums[0])};
        }

        int[] result = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int counter = nums.length-1;

        while (leftPointer < rightPointer){

            if (calcSquare(nums[leftPointer]) >= calcSquare(nums[rightPointer])){
                result[counter] = calcSquare(nums[leftPointer]);
                leftPointer++;
            } else {
                result[counter] = calcSquare(nums[rightPointer]);
                rightPointer--;
            }
            counter--;

            if (leftPointer == rightPointer){
                result[counter] = calcSquare(nums[leftPointer]);
            }

        }

        return result;
    }
    private static int calcSquare(int number){
        return number*number;
    }
}
