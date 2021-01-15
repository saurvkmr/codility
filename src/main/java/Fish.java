import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 1, 0};
        System.out.println(countSurvivedFish(A, B));
    }

    private static int countSurvivedFish(int[] A, int[] B) {
        Stack<Integer> downFish = new Stack<>();
        int i = 0, survived = 0;
        while(i < A.length) {
            if (B[i] == 1) {
                downFish.push(A[i]);
            } else {
                if (fishSurvived(A[i], downFish))
                    survived++;
            }
            i++;
        }
        return survived + downFish.size();
    }

    private static boolean fishSurvived(int fish, Stack<Integer> downFish) {
        while(!downFish.isEmpty()) {
            if (fish < downFish.peek())
                return false;
            downFish.pop();
        }
        return true;
    }
}
