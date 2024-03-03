package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strings = {"aa","aa"};
        System.out.println(LongestCommonPrefix14.longestCommonPrefix(strings));


    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length<=1){
            return strs[0];
        }

        StringBuilder stringBuilder = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        int minWordLength = Arrays.stream(strs).mapToInt(String::length).min().orElse(0);
        if (minWordLength!=0){
            int iterationNumber = 0;
            while (iterationNumber < minWordLength){
                for (String word:strs) {
                    char c = word.charAt(iterationNumber);
                    stringBuilder.append(c);
                }
                if (stringBuilder.chars().distinct().count()>1){
                    break;
                } else {
                    result.append(stringBuilder.charAt(0));
                    stringBuilder = new StringBuilder("");
                }
                iterationNumber++;
            }
        }
        return result.toString();
    }
}
