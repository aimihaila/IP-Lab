import java.util.Set;
import java.util.TreeSet;

public class ConceptClass implements Comparable<ConceptClass>{
    private String nameClass;
    private Set<String> keywords = new TreeSet<>();

    ConceptClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords.addAll(keywords);
    }

    public void setKeywords(String... keywords) {
        for (String keyword: keywords)
            this.keywords.add(keyword);
    }

    public String getNameClass() {
        return nameClass;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    @Override
    public int compareTo(ConceptClass obj) {
        try {
            if (this == obj) return 0;
            int code = this.nameClass.compareTo(obj.nameClass);
            if (code != 0)
                return code;

            return 0;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
