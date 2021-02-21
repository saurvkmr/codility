public class MaxNonOverlappingSegment {
    public static void main(String[] args) {

    }

    private static int bruteForce(int[] A, int[] B) {
        if (A.length == 0)
            return 1;
        int count = 1, prevEnd = B[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > prevEnd) {
                count++;
                prevEnd = B[i];
            }
        }
        return count;
    }
}
