package other;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();
        System.out.println(palindromeNumber9.isPalindrome(-121));

    }

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        Deque <Integer> number = new ArrayDeque<>();
        while (x > 0){
            number.push(x%10);
            x = x/10;
        }

        while (number.size() > 1){
            if (!Objects.equals(number.pollFirst(), number.pollLast())){
                return false;
            }
        }
        return true;
    }
}
