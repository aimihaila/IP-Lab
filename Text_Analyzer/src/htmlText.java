import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlText {
    private String text;

    enum Found {
        yes, no;
    }

    public Found getX() {
        return x;
    }

    private Found x;

    public htmlText(String url) {
        try {
            Document doc = Jsoup.connect(url).get();

            text = Jsoup.parse(String.valueOf(doc)).text();

            x = Found.yes;
        } catch (Exception ex) {
            x = Found.no;
            System.out.println(ex);
        }

    }
    public String getText() {
        return text;
    }
}