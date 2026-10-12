import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SampleTwo {

    public String concat(List<String> items) {
        String result = "";
        for (String item : items) {
            result = result + item;
        }
        return result;
    }

    public void load(String path) {
        try {
            Files.readString(Path.of(path));
        } catch (Exception e) {
        }
    }

    public int calculate(int x) {
        return x * 86400;
    }

    public String findUser(String id) {
        if (id == null) {
            return null;
        }
        return "user-" + id;
    }
}
