package arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i=0; i < nums.length; i++){
            if (checkNumber(nums[i])){
                result++;
            }
        }
        return result;
    }

    private static boolean checkNumber(int num) {
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
