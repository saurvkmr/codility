import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeleteForUniqOccurence {
    public static void main(String[] args) {
        System.out.println(minDelete("ccaaffddecee"));
    }

    static int minDelete(String S) {
        Map<Character, Integer> occurenceCount = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            /*int count = occurenceCount.getOrDefault(c,0);
            occurenceCount.put(c, count+1);*/
            occurenceCount.computeIfAbsent(c, k -> 0);
            occurenceCount.computeIfPresent(c, (k,v) -> v+1);
        }
        Set<Integer> takenFrequencies = new HashSet<>();
        int cost = 0;
        for (Map.Entry<Character, Integer> entry : occurenceCount.entrySet()) {
            int frequency = entry.getValue();
            if (takenFrequencies.contains(frequency)) {
                while(frequency > 0) {
                    frequency--;
                    cost++;
                    if (takenFrequencies.contains(frequency)) {
                        continue;
                    }
                    takenFrequencies.add(frequency);
                    break;
                }
            }
            takenFrequencies.add(frequency);
        }
        return cost;
    }

}
