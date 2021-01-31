import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 1, 2};
        System.out.println(getSmallestMissing(arr));
    }

    private static int getSmallestMissing(int[] nums) {
        Set<Integer> num = new HashSet<>();
        int max= 0;
        for (int i : nums) {
            if (i > 0) {
                max = Math.max(max, i);
                num.add(i);
            }
        }
        if (num.isEmpty()) {
            return 1;
        }
        for (int i = 1; i <= max; i++) {
            if (!num.contains(i)) {
                return i;
            }
        }
        return max+1;
    }
}
