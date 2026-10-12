import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class Sample {

  private static final int SECONDS_IN_A_DAY = 86400;

  /**
   * Joins the given items into a single string with no separator.
   *
   * @param items the strings to join
   * @return the concatenated result, or an empty string when items is empty
   */
  public String concat(List<String> items) {
    StringBuilder result = new StringBuilder();
    for (String item : items) {
      result.append(item);
    }
    return result.toString();
  }

  public void load(String path) {
    try {
      Files.readString(Path.of(path));
    } catch (java.io.IOException e) {
      throw new FileLoadException("Failed to load file: " + path, e);
    }
  }

  public int calculate(int x) {
    return x * SECONDS_IN_A_DAY;
  }

  public Optional<String> findUser(String id) {
    if (id == null) {
      return Optional.empty();
    }
    return Optional.of("user-" + id);
  }
}
