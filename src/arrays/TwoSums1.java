package arrays;

import java.util.Arrays;

public class TwoSums1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int firstElement = 0;
        while (firstElement <= nums.length-2) {
            for (int i = firstElement+1; i < nums.length; i++) {
                if (nums[firstElement] + nums[i] == target){
                    result[0] = firstElement;
                    result[1] = i;
                    return result;
                }
            }
            firstElement++;
        }
        return result;
    }
}
