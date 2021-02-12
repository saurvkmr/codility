import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CropMsg {

    public static void main(String[] args) {
        String sol = solution("To crop or not to crop", 8);
        System.out.println(sol + " " + sol.length());
    }

    public static String solution(String message, int K) {
        // write your code in Java SE 8
        int totalLength = 0;
        if (message.length() <= K)
            return message;
        String[] msgArr = message.split(" ");
        List<String> strings = new ArrayList<>(msgArr.length);
        for (String msg : msgArr) {
            if (totalLength + msg.length() <= K) {
                strings.add(msg);
                totalLength = totalLength + msg.length() + 1;
            } else {
                break;
            }
        }
        return strings.stream().collect(Collectors.joining(" "));
    }
}
