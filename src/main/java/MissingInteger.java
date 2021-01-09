import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int i : A) {
            nums.add(i);
        }
        int len = nums.size();
        if (len == 0) {
            return 1;
        }
        int i = 0;
        for (; i < len; i++) {
            if (!nums.contains(i+1)) {
                return i+1;
            }
        }
        return i+1;
    }
}
