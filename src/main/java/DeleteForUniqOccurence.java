import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeleteForUniqOccurence {
    public static void main(String[] args) {
        System.out.println(minDelete("ccaaffddecee"));
    }

    static int minDelete(String S) {
        Map<Character, Integer> occrCount = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int count = occrCount.getOrDefault(c,0);
            occrCount.put(c, count+1);
        }
        Set<Integer> freqTaken = new HashSet<>();
        int cost = 0;
        for (Map.Entry<Character, Integer> entry : occrCount.entrySet()) {
            int freq = entry.getValue();
            if (freqTaken.contains(freq)) {
                while(freq > 0) {
                    freq--;
                    cost++;
                    if (freqTaken.contains(freq)) {
                        continue;
                    }
                    freqTaken.add(freq);
                    break;
                }
            }
            freqTaken.add(freq);
        }
        return cost;
    }

}
