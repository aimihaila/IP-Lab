public class Concept implements Comparable<Concept>{
    private String name;
    private ConceptClass conceptClass;
    private String url;
    private Boolean foundInDB;

    Concept() {
        this.foundInDB = false;
    }

    public String getName() {
        return name;
    }

    public ConceptClass getConceptClass() {
        return conceptClass;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConceptClass(ConceptClass conceptClass) {
        this.conceptClass = conceptClass;
    }

    public void setUrl(String url) {
        this.url = url;
    }


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
