import java.util.Arrays;

public class MaxSqaureBlock {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        for (int a : A) {
            max = Math.max(max, a);
        }
        int maxSqLenPossible = Math.min(max, A.length);
        int result = 0;
        for (int i = maxSqLenPossible; i > 0; i--) {
            int continious = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] >= i) {
                    continious++;
                    if (continious == i) {
                        return i;
                    }
                } else {
                    continious = 0;
                    if (A.length - j < i)
                        break;
                }
            }
        }
        return result;
    }

    /*
    windowSize = front - back
    windowMin > windowSize && A[front+1] > windowMin
        front++
    windowMin < windowSize && windowMin == A[back]
        back++
        recalculate windowMin
     */

    private static int slidingWindow(int[] A) {
        int back = 0, front = 0, windowMin = A[0];
        int result = 1;
        while (front < A.length) {
            int windowSize = front - back + 1;
            windowMin = Math.min(windowMin, A[front]);
            if (windowMin >= windowSize) {
                result = windowSize;
                front++;
                continue;
            }
            if (windowMin < windowSize) {
                if (windowMin == A[back++]) {
                    windowMin = calculateMin(Arrays.copyOfRange(A, back, front + 1));
                }
            }
            front++;
        }
        return result;
    }

    private static int calculateMin(int[] copy) {
        int min = Integer.MAX_VALUE;
        for (int i : copy) {
            min = Math.min(min, i);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 3};
        System.out.println(solution(arr));
        System.out.println(slidingWindow(arr));
        int[] arr1 = {6, 5, 5, 6, 2, 2};
        System.out.println(solution(arr1));
        System.out.println(slidingWindow(arr1));
        int[] arr2 = {3, 3, 3, 5, 4};
        System.out.println(solution(arr2));
        System.out.println(slidingWindow(arr2));
    }
}
