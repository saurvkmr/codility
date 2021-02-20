import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OddOccurence {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> nums = new HashSet<>();
        Arrays.stream(A)
                .forEach( num -> {
                    if (nums.contains(num))
                        nums.remove(num);
                    else nums.add(num);
                });
        return nums.stream().findAny().get();
    }
}
