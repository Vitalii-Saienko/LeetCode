package collections.hashMap;

import java.util.HashMap;

public class RansomNote383 {
    /*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
    letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char letter: magazine.toCharArray()) {
            int counter = 1;
            if (map.containsKey(letter)){
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, counter);
            }
        }

        for (char letterFromRansom: ransomNote.toCharArray()) {
            if (map.containsKey(letterFromRansom) && map.get(letterFromRansom)>0){
                map.put(letterFromRansom, map.get(letterFromRansom) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
