import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetKey {

    public void  Search(String text,String text2){
        GrammarSeparator textSeparator = new GrammarSeparator();
        textSeparator.createList(text);
        Set<String> listOfurl = new TreeSet<>();
        listOfurl = textSeparator.getPassingWords();
        htmlText ht;
        List<String> listOfpages = new ArrayList<String>();
        if(listOfurl.size()>=2)
            for (String url: listOfurl) {
                ht = new htmlText("http://en.wikipedia.org/wiki/" + url);
                if(ht.getX()== htmlText.Found.yes)
                    listOfpages.add(ht.getText());

            }
        textSeparator.createList(text2);

        listOfurl = textSeparator.getPassingWords();
        List<String> listOfpages2 = new ArrayList<String>();

        for (String url: listOfurl) {
            ht = new htmlText("http://en.wikipedia.org/wiki/" + url);
            if(ht.getX()== htmlText.Found.yes)
                listOfpages2.add(ht.getText());

        }


        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z]+");

        Matcher m1 = p.matcher(listOfpages.get(0));
        List<String> listOfwords = new ArrayList<String>(); //no fixed size mentioned
        while (m1.find()) {
            listOfwords.add(m1.group());

        }
        List<String> listOfwords2 = new ArrayList<String>(); //no fixed size mentioned
        m1 = p.matcher(listOfpages.get(1));
        while (m1.find()) {
            listOfwords2.add(m1.group());
        }

        Set<String> listOfkay = new TreeSet<>(); //no fixed size mentioned
        for (int i=0;i<listOfwords.size();i++)
        {
            for (int j=0;j<listOfwords2.size();j++)
            {
                if(listOfwords.get(i).equals(listOfwords2.get(j)))
                {
                    listOfkay.add(listOfwords.get(i));
                }
            }
        }



        Set<String> listOfkayy = new TreeSet<>();
        for(String k:listOfpages)
        {

            for (String i:listOfkay
                    ) {
                if(k.contains(i))
                    listOfkayy.add(i);
            }
            listOfkay.removeAll(listOfkay);
            listOfkay.addAll(listOfkayy);
            listOfkayy.removeAll(listOfkayy);


        }



        for(String k:listOfpages2)
        {

            for (String i:listOfkay
                    ) {
                if(k.contains(i))
                {;
                }
                else
                {
                    listOfkayy.add(i);
                }
            }
            listOfkay.removeAll(listOfkay);
            listOfkay.addAll(listOfkayy);
            listOfkayy.removeAll(listOfkayy);


        }

        for (String i:listOfkay
                )
            System.out.println(i );
    }

}