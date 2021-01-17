public class Casino {

    public static void main(String[] args) {
        System.out.println(solution(18, 2));
    }

    public static int solution(int N, int K) {
        // write your code in Java SE 8
        if (K == 0)
            return N -1;
        int playCount = 0;
        while (N > 1) {
            if (K > 0 && N % 2 == 0) {
                K--;
                N = N / 2;
            } else {
                N -= 1;
            }
            playCount++;
        }
        return playCount;
    }
}
