public class MaxSqaureBlock {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        for (int a : A) {
            max = Math.max(max, a);
        }

        int result = 0;
        for (int i = max; i > 0; i--) {
            int continious = 0;
            for (int a : A) {
                if (a >= i) {
                    continious++;
                    if (continious == i) {
                        return i;
                    }
                } else {
                    continious = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 3};
        System.out.println(solution(arr));
        int[] arr1 = {6, 5, 5, 6, 2, 2};
        System.out.println(solution(arr1));
    }
}
