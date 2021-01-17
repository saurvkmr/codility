import java.util.ArrayDeque;
import java.util.Queue;

public class Fifo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(calculateFifo(arr));
    }
    static int calculateFifo(int[] arr) {
        Queue<Integer> q = new ArrayDeque<>(3);
        int pageFault = 0;
        for (int i : arr) {
            if (!q.contains(i)) {
                pageFault++;
                if (q.size() >= 4)
                    q.remove();
                q.add(i);
                System.out.println(q);
            }
        }
        return pageFault;
    }
}
