import java.util.Set;
import java.util.TreeSet;

public class Concept implements Comparable<Concept>{
    private String name;
    private ConceptClass conceptClass;
    private String conceptSubclass;
    private String url;
    private Set<String> characteristics = new TreeSet<>();
    private Boolean foundInDB;
    private int accuracy = 1;

    Concept() {
        this.foundInDB = false;
    }

    public String getName() {
        return name;
    }

    public ConceptClass getConceptClass() {
        return conceptClass;
    }

    public String getConceptSubclass() { return conceptSubclass; }

    public String getUrl() { return url; }

    public Set<String> getCharacteristics() { return characteristics; }

    public int getAccuracy() { return accuracy; }

    public void setName(String name) {
        this.name = name;
    }

    public void setConceptClass(ConceptClass conceptClass) {
        this.conceptClass = conceptClass;
    }

    public void setConceptSubclass(String conceptSubclass) { this.conceptSubclass = conceptSubclass; }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCharacteristics(Set<String> characteristics) { this.characteristics.addAll(characteristics); }

    public void setCharacteristics(String... characteristics) {
        for (String characteristic: characteristics)
            this.characteristics.add(characteristic);
    }

    public void setAccuracy(int accuracy) { this.accuracy = accuracy; }

    public void setFoundInDB(Boolean foundInDB) {
        this.foundInDB = foundInDB;
    }

    public Boolean getFoundInDB() {
        return foundInDB;
    }

    @Override
    public int compareTo(Concept obj) {
        try {
            if (this == obj) return 0;
            int code = this.name.compareTo(obj.name);
            if (code != 0)
                return code;

            return 0;
        } catch (NullPointerException e) {
            return 1;
        }
    }
}
