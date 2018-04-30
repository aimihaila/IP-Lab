import java.util.Set;

public interface TextSeparator {

    void createList(String text);

    Set<String> getPassingWords();
}