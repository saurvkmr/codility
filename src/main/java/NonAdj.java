public class NonAdj {
    public static void main(String[] args) {
        int[] arr = {4,5,21,12,33,2,3,1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE, thirdMin = Integer.MAX_VALUE;
        int minIdx = -1, secMinIdx = -1, thirdMinIdx = -1;

        for (int i = 1; i < A.length-1; i++) {
            if (min > A[i]) {
                thirdMin = secMin;
                secMin = min;
                min = A[i];
                thirdMinIdx = secMinIdx;
                secMinIdx = minIdx;
                minIdx = i;
            } else if (secMin > A[i]) {
                thirdMin = secMin;
                secMin = A[i];
                thirdMinIdx = secMinIdx;
                secMinIdx = i;
            } else if (thirdMin > A[i]) {
                thirdMin = A[i];
                thirdMinIdx = i;
            }
        }


        if (Math.abs(secMinIdx - minIdx) > 1) {
            return secMin + min;
        }
        if (Math.abs(thirdMinIdx - minIdx) > 1) {
            return thirdMin + min;
        }

        /*if (secMinIdx != minIdx + 1) {
            return secMin + min;
        }
        if (thirdMinIdx != minIdx + 1) {
            return thirdMin + min;
        }*/
        return secMin + thirdMin;
    }
}
