public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        int[] arr = {1,5,2,1,4,0};
        System.out.println(new NumberOfDiscIntersections().solution(arr));
    }

    // left end -> i - A[i], right end -> A[i] + i
    // intersect -> right_i - left_j < 0 || right_j - left_i < 0
    // N^2
    public int solution(int[] A) {
        long intersections = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                int left_i = i - A[i], right_i = i + A[i], left_j = j - A[j], right_j = j + A[j];
                if (right_i - left_j < 0 || right_j - left_i < 0) {
                    continue;
                }
                intersections++;
            }
        }
        if (intersections > 10000000)
            return -1;
        return (int) intersections;
    }
}
