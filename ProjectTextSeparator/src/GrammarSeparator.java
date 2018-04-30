import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class GrammarSeparator implements TextSeparator {
   private StanfordCoreNLP pipeline;
    private Set<String> passingWords = new TreeSet<String>();
    public GrammarSeparator() {
        setup();
    }

    public void createList(String text){
       Annotation document = new Annotation(text);
       pipeline.annotate(document);
       List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);

       for (CoreMap sentence : sentences) {
           // traversing the words in the current sentence
           // a CoreLabel is a CoreMap with additional token-specific methods
           for (CoreLabel token : sentence.get(CoreAnnotations.TokensAnnotation.class)) {
               // this is the text of the token
               String word = token.get(CoreAnnotations.TextAnnotation.class);
               // this is the POS tag of the token
               String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);

                addPConcept(pos,word);
           }
       }

    }

    private String adj;
    private void addPConcept(String pos,String word){
        if(pos.equals("NN"))
        {
            this.passingWords.add(word);


            if(!adj.equals(""))
            {
                this.passingWords.add((adj+"_"+word));
                adj="";
            }
        }
        else
        {
            if(pos.equals("NNS"))
            {
                word = PutSingularFormForNouns(word);
                this.passingWords.add(word);

                if(!adj.equals(""))
                {
                    this.passingWords.add((adj+" "+word));
                    adj="";
                }
            }
            else
            {
                if(pos.equals("JJ"))
                {
                    adj=word;

                }
            }
        }

    }
    private void setup()
    {
        adj="";
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos");
        pipeline = new StanfordCoreNLP(props);
    }
    private String PutSingularFormForNouns(String word)
    {

                if(word.charAt(word.length()-3)=='i' && word.charAt(word.length()-2)=='e' && word.charAt(word.length()-1)=='s') {
                    word = word.substring(0, word.length() - 3);
                    word += 'y';
            }
                else
                    //s, x, z, ch, sh
                if((word.charAt(word.length()-3)=='s' || word.charAt(word.length()-3)=='x' || word.charAt(word.length()-3)=='z' ||
                        (word.charAt(word.length()-3)=='h'&&(word.charAt(word.length()-4)=='c'||word.charAt(word.length()-4)=='s')))
                        && word.charAt(word.length()-2)=='e' && word.charAt(word.length()-1)=='s')
                    word = word.substring(0, word.length() - 2);
                else
                    word = word.substring(0, word.length() - 1);

        return word;
    }

    public Set<String> getPassingWords() {
        return passingWords;
    }
}
