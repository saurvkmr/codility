/*
You are given a matrix A consisting of N rows and M columns, where each cell contains a digit.
Your task is to find a continuous sequence of neighbouring cells, starting in the top-left corner and ending in the
bottom-right corner (going only down and right), that creates the biggest possible integer by concatenation of digits on the path.
 By neighbouring cells we mean cells that have exactly one common side.
*/
public class MaxPathFromTheLeftTopCorner {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 9},
                {9, 7}
        };
        System.out.println(maxPath(arr));
    }

    private static int maxPath(int[][] A) {
        StringBuilder sb = new StringBuilder();
        int len = A.length, width = A[0].length;
        int[][] result = new int[len+1][width+1];
        int max = 0;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j < width + 1; j++) {
                result[i][j] = Math.max(result[i-1][j], result[i][j-1]) * 10 + A[i - 1][j - 1];
                max = Math.max(max, result[i][j]);
            }
        }
        return max;
    }

    private static int NotWorkingMaxPath(int[][] A) {
        StringBuilder sb = new StringBuilder(A[0][0]);

        int len = A.length, width = A[0].length, right = 0, down = 0;
        int i = 0, j = 0;
        sb.append(A[i][j]);
        while (i < len - 1 && j < width - 1) {
            right = A[i][j + 1];
            down = A[i + 1][j];
            if (right >= down) {
                sb.append(right);
                j++;
            } else {
                sb.append(down);
                i++;
            }
        }
        if (j == width - 1) {
            i++;
            while (i < len) {
                sb.append(A[i][j]);
                i++;
            }
        }
        if (i == len - 1) {
            j++;
            while (j < width) {
                sb.append(A[i][j]);
                j++;
            }
        }
        return Integer.valueOf(sb.toString());

    }
}
