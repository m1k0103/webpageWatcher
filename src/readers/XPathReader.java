package readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;


public class XPathReader extends GenericReader{
    // Constructor
    public XPathReader(String website) {
        super(website);
    }


    // Gets a certain element based on its xpath
    public String get(String xpath) throws IOException {
        String rawContents = super.get();
        Document contentsToParse = Jsoup.parse(rawContents);

        Elements element = contentsToParse.selectXpath(xpath);
        if (element.toString().isEmpty()){
            throw new RuntimeException("Element Xpath is invalid. No element found.");
        }
        return element.toString();
    }
}
