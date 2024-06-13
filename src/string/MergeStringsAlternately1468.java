package string;

public class MergeStringsAlternately1468 {
    public String mergeAlternately(String word1, String word2) {
        int pointerOne = 0;
        int pointerTwo = 0;
        StringBuilder answer = new StringBuilder();
        while (true){
            if (pointerOne > word1.length()-1 && pointerTwo > word2.length()-1){
                break;
            }
            if (pointerOne <= word1.length()-1){
                answer.append(word1.charAt(pointerOne));
                pointerOne++;
            }
            if(pointerTwo <= word2.length()-1){
                answer.append(word2.charAt(pointerTwo));
                pointerTwo++;
            }
        }
        return answer.toString();
    }
}
