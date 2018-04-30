import java.util.Set;
import java.util.TreeSet;

public class TextAnalyzer {
    private TextSeparator textSeparator;
    private Register register;
    private LongMemory memory;
    private String[] listOfWords;
    private Set<Concept> listOfConcepts = new TreeSet<>();

    public void setTextSeparator(TextSeparator textSeparator) {
        this.textSeparator = textSeparator;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public void setMemory(LongMemory memory) {
        this.memory = memory;
    }

    public void textAnalyzer(String text) {
        //we add the concept classes (manually) from the our_concepts_classes.txt
        this.register = new RegisterWiki();

        // #TODO take the information from the .txt and create a ConceptsClass for each concept found
        ConceptClass[] listCC = new ConceptClass[2];
        // #TODO add the ConceptClass-es to the list

        // receives the text and uses textSeperator to create the list of possible concepts from the text

        this.textSeparator = new GrammarSeparator();
        this,textSeparator.createList(text);
        // this.textSeparator.getPassingWords(); <- list of Strings (nouns from text)
        this.listOfWords = this.textSeparator.getPassingWords();
        this.memory = new LongMemory();
        // for each concept obtained, the word/words is/are searched in a data base (from long memory) to see if it already exists;
        // otherwise, we add the word in the data base (long memory) using the register
        for (String word: listOfWords) {
            Concept item = this.memory.search(word);
            if (item.getFoundInDB())
                this.listOfConcepts.add(item);
            else {
                for (ConceptClass cc:listCC) {
                    item = this.register.searchWiki(word, cc);
                    if (item.getFoundInDB()) {
                        this.listOfConcepts.add(item);
                        break;
                    }
                }
            }
        }

        // #TODO make a json with listOfConcepts

        // #extra info
        // the register makes a request on the wiki page at https://en.wikipedia.org/wiki/{the_concepts}
        // for each class, concepts that is recognised by the textAnalyzer, we search for the keyword and
        // return (the register) an object consisting concept class (the name) and the wiki URL

    }
}
