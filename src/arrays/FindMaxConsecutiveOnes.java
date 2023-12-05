package arrays;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1,0,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int finalResult = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                result++;
                if (i==nums.length-1 && result > finalResult){
                    finalResult = result;
                }
            } else {
                if (finalResult < result){
                    finalResult = result;
                }
                result = 0;
            }
        }
        return finalResult;
    }
}
