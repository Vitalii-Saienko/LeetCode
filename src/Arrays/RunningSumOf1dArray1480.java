package Arrays;
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RunningSumOf1dArray1480 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] answer = generateRunningSum(array);
        System.out.println(Arrays.toString(answer));
        int[] answer2 = generateRunningSum2(array);
        System.out.println(Arrays.toString(answer2));
    }

    private static int[] generateRunningSum(int[] array) {
        int[] answer = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            answer[i] = sum;
        }
        return answer;
    }

    private static int[] generateRunningSum2(int[] array) {
        int[] answer = new int[array.length];
        AtomicInteger sum = new AtomicInteger();
        Arrays.setAll(answer, i -> sum.addAndGet(array[i]));
        return answer;
    }
}