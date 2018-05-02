import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {
    private TextSeparator textSeparator;
    private Register register;
    private LongMemory memory;
    private String[] listOfWords;
    private Set<Concept> listOfConcepts = new TreeSet<>();
    private final String filename = "./assessments/our_concepts_class.txt";

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
        this.memory = new LongMemory();
        this.register = new RegisterWiki(this.memory);

        // #TODO take the information from the .txt and create a ConceptsClass for each concept found
        Map<String, Set<String>> listFromTxt = getConceptsFromTxt(this.filename);

        Set<ConceptClass> listCC = new TreeSet<>();
        // #TODO add the ConceptClass-es to the list

        for (Map.Entry<String, Set<String>> entry : listFromTxt.entrySet()) {
            ConceptClass cc = new ConceptClass(entry.getKey());
            cc.setKeywords(entry.getValue());
            listCC.add(cc);
        }

        // receives the text and uses textSeperator to create the list of possible concepts from the text

        this.textSeparator = new GrammarSeparator();
        // --this.textSeparator.createList(text);
        // this.textSeparator.getPassingWords(); <- list of Strings (nouns from text)
        // --this.listOfWords = this.textSeparator.getPassingWords();
        // for each concept obtained, the word/words is/are searched in a data base (from long memory) to see if it already exists;
        // otherwise, we add the word in the data base (long memory) using the register
        if (listOfWords != null)
            for (String word: listOfWords) {
                Concept item = this.memory.search(word);
                if (item.getFoundInDB())
                    this.listOfConcepts.add(item);
                else {
                    for (ConceptClass cc:listCC) {
                        // --item = this.register.searchWiki(word, cc);
                        if (item.getFoundInDB()) {
                            this.listOfConcepts.add(item);
                            break;
                        }
                    }
                }
            }

        // #TODO make a json with listOfConcepts

        JSONObject jsonData = new JSONObject();

        for (Concept concept: listOfConcepts) {
            Set<Object> value = new TreeSet<>();
            value.add(concept.getUrl());
            value.add(concept.getFoundInDB());
            value.add(concept.getConceptClass());
            jsonData.put(concept.getName(), value);
        }

        System.out.println(jsonData.toString());

        // #extra info
        // the register makes a request on the wiki page at https://en.wikipedia.org/wiki/{the_concepts}
        // for each class, concepts that is recognised by the textAnalyzer, we search for the keyword and
        // return (the register) an object consisting concept class (the name) and the wiki URL

    }

    public Map<String, Set<String>> getConceptsFromTxt(String filename) {
        Map<String, Set<String>> result = new HashMap<>();

        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            String str = new String(data, "UTF-8");
            List<String> allMatches = new ArrayList<>();
            String patternBlock = "\\{([^\\}]+)\\}";
            String patternName = "\\[(\\w+)\\]";
            String patternKeywords = "\"([^\"]+)\"";
            Pattern r = Pattern.compile(patternBlock);
            Pattern r1 = Pattern.compile(patternName);
            Pattern r2 = Pattern.compile(patternKeywords);

            Matcher m = r.matcher(str);
            while (m.find()) {
                allMatches.add(m.group());
            }
            System.out.println(allMatches);

            for (String match: allMatches) {
                Matcher m1 = r1.matcher(match);
                Matcher m2 = r2.matcher(match);
                String name = null;
                Set<String> keywords = new TreeSet<>();
                while (m1.find()) {
                    name = m1.group(1);
                }

                while (m2.find()) {
                    keywords.add(m2.group(1));
                }
                result.put(name, keywords);
            }
            return result;

        } catch (FileNotFoundException error) {
            System.out.println(error);
        } catch (IOException error) {
            System.out.println(error);
        }
        return null;
    }
}
