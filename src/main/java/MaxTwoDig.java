public class MaxTwoDig {
    public static void main(String[] args) {
        System.out.println(solution("50552"));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        int max = Integer.MIN_VALUE;
        int fIdx = 0, sIdx = 1;
        while(sIdx < S.length()) {
            max = Math.max(max, Integer.parseInt("" + S.charAt(fIdx) + "" + S.charAt(sIdx)));
            sIdx++;
            fIdx++;
        }
        return max;
    }
}
