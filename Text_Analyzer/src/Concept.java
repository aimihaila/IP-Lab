public class Concept {
    private String name;
    private ConceptClass conceptClass;
    private String url;
    private Boolean foundInDB;

    Concept() {
        this.foundInDB = false;
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
}
