package Readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CssClassReader extends GenericReader{
    // Constructor
    public CssClassReader(String website) {
        super(website);
    }


    // Gets all elements that have a certain CSS class
    public String getAll(String cssClass) throws IOException {
        String rawContents = super.get();
        Document contentsToParse = Jsoup.parse(rawContents);

        // find all elements of certain class
        Elements elements = contentsToParse.select(String.format("*.%s", cssClass));

        // check if any elements found
        if (elements.toString().isEmpty()){
            throw new RuntimeException(String.format("No elements found containing a class of %s", cssClass));
        }
        return elements.toString();
    }


    // Gets the first element in a document that contains a certain CSS class
    public String getFirst(String cssClass) throws IOException {
        String rawContents = super.get();
        Document contentsToParse = Jsoup.parse(rawContents);

        // find all elements of certain class
        Elements allElements = contentsToParse.select(String.format("*.%s", cssClass));
        Element element = allElements.first();


        // check if any elements found
        if (element == null){
            throw new RuntimeException(String.format("No elements found containing a class of %s", cssClass));
        }
        return element.toString();
    }
}
