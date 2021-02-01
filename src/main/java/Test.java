import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {
        createSelectQuery("/Users/s0k02c9/Desktop/NSF_International_create_table.sql");
    }

    private static void createSelectQuery(String filePath) {
        try {
            List<String> selectQueries = new CopyOnWriteArrayList<>();
            List<String> queries = Files.readAllLines(Paths.get(filePath));
            queries.parallelStream().forEach(line -> {
                String selectQuery = extractKeySpaceTableName(line, "CREATE TABLE");
                if (selectQuery != null)
                    selectQueries.add(selectQuery);
            });
            System.out.println(selectQueries);
            Files.write(Paths.get(filePath), selectQueries, StandardOpenOption.APPEND);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    private static String extractKeySpaceTableName(String line, String createTable) {
        if (line.contains(createTable)) {
            String[] arr = line.split(" ");
            //System.out.println(Arrays.deepToString(arr));
            return String.join("", "SELECT * FROM ", arr[2].trim(), ";");
        }
        return null;
    }
}
