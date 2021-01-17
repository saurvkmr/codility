public class GenomicRangeQuery {
    public static void main(String[] args) {
        int[] P = {0,0,4,7};
        int[] Q = {8,2,5,7};
        System.out.println(solution("GACACCATA", P, Q));
    }
    public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int A[] = new int[S.length() + 1], C[] = new int[S.length() + 1], G[] = new int[S.length() + 1];

        int last_a = 0, last_c = 0, last_g = 0;

        int results[] = new int[P.length];
        int p = 0, q = 0;
        for (int i = S.length() - 1; i >= 0; i -= 1) {
            switch (S.charAt(i)) {
                case 'A': {
                    last_a += 1;
                    break;
                }
                case 'C': {
                    last_c += 1;
                    break;
                }

                case 'G': {
                    last_g += 1;
                    break;
                }

            }
            A[i] = last_a;
            G[i] = last_g;
            C[i] = last_c;
        }


        for (int i = 0; i < P.length; i++) {
            p = P[i];
            q = Q[i];

            if (A[p] - A[q + 1] > 0) {
                results[i] = 1;
            } else if (C[p] - C[q + 1] > 0) {
                results[i] = 2;
            } else if (G[p] - G[q + 1] > 0) {
                results[i] = 3;
            } else {
                results[i] = 4;
            }

        }
        return results;
    }
}
