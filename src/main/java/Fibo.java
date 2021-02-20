import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fibo {
    static Map<Long, Long> memo = new HashMap<>();
    static long res;
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        int n = 50;
        Runnable one = () -> System.out.println("one "+fibo(n));
        Runnable two = () -> System.out.println("two "+dpFibo(n));
        ex.execute(two);
        ex.execute(one);
        ex.shutdown();

        //System.exit(0);
    }

    private static Long fibo(long n) {
        if (n < 2) return 1L;
        return fibo(n-1) + fibo(n-2);
    }

    private static Long dpFibo(long n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1L;
        else res = fibo(n-1) + fibo(n-2);
        memo.put(n, res);
        return res;
    }
}
