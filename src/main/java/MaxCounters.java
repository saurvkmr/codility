import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(solution(5, arr)));

        String s = "% sdfs %";
        System.out.println(s = s.replace("%", "#"));
        System.out.println(s = s.replace("%", "#"));
    }

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int[] res = new int[N];

        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            if (val < N + 1) {
                val = val-1;
                res[val] += 1;
                if (max < res[val]) {
                    max = res[val];
                }
            } else {
                int j = 0;
                while (j < N) {
                    res[j] = max;
                    j++;
                }
            }
        }
        return res;
    }
}
