package other;

public class ReverseInteger7 {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        StringBuilder builder = new StringBuilder();

        if (x < 0){
            builder.append(x).deleteCharAt(0).reverse().insert(0,"-");
        } else {
            builder.append(x).reverse();
        }

        long answer = Long.parseLong(builder.toString());

        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE){
            return 0;
        } else {
            return (int) answer;
        }
    }
}
