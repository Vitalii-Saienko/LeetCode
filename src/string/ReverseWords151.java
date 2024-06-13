package string;


public class ReverseWords151 {

    public String reverseWords(String s) {
        String[] strings = s.split("\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length-1; i >= 0; i--) {
            stringBuilder.append(strings[i].trim()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
