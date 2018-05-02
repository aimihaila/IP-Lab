import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// TODO: install jsoup first
public class RegisterWiki implements Register {
    private LongMemory _memory;

    RegisterWiki(LongMemory memory) {
        this._memory = memory;
    }

    public Concept register(String searchedWord, ConceptClass cc) {
        try {
            Document doc = Jsoup.connect("http://en.wikipedia.org/wiki/" + searchedWord).get();

            boolean found = true;
            for(String keyword: cc.getKeywords()) {
                Elements e = doc.select(":matches(" + keyword + ")");
                if (e.toString().length() == 0) {
                    found = false;
                    break;
                }
            }
            if (found)
            {
                System.out.println("found");
                Concept c = new Concept();
                c.setConceptClass(cc);
                c.setName(cc.getNameClass());
                c.setFoundInDB(false);
                return c;
            }
            else
            {
                System.out.println("not found");
                return new Concept();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return new Concept();
    }
}
