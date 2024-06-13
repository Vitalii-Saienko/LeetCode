package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestNumberCandies1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int maxCandies = candies[0];

        for (int i = 1; i <= candies.length-1; i++) {
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        for (int number: candies) {
            boolean isGreatest = (number + extraCandies) >= maxCandies;
            answer.add(isGreatest);
        }
        return answer;
    }
}
