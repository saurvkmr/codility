import java.util.HashMap;
import java.util.Map;

public class LovelyInteger {

    public static void main(String[] args) {
        System.out.println(solution(1000, 1120));
    }

    public static int solution(int A, int B) {
        // write your code in Java SE 8
        int countLovely = 0;
        for (int i = A; i <= B; i++) {
            if (isLovely(i)) {
                System.out.print(i + " ");
                countLovely++;
            }
        }
        return countLovely;
    }

    public static boolean isLovely(int k) {
        String num = String.valueOf(k);
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int count = charCount.getOrDefault(num.charAt(i), 0);
            charCount.put(num.charAt(i), ++count);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 2) {
                return false;
            }
        }
        return true;
    }
}
