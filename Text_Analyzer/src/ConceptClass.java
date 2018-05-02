import java.util.Set;
import java.util.TreeSet;

public class ConceptClass {
    private String nameClass;
    private Set<String> keywords = new TreeSet<>();

    ConceptClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setKeywords(String... keywords) {
        for (String keyword: keywords)
            this.keywords.add(keyword);
//        this.keywords.addAll(keywords);
    }

    public String getNameClass() {
        return nameClass;
    }

    public Set<String> getKeywords() {
        return keywords;
    }
}
