package Readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class IdReader extends GenericReader{
    // Constructor
    public IdReader(String website) {
        super(website);
    }

    public String get(String id) throws IOException {
        String rawPageData = super.get();
        Document doc = Jsoup.parse(rawPageData);

        Element el = doc.select(String.format("*#%s", id)).first();

        // Check if element is found
        if (el == null){
            throw new RuntimeException(String.format("Element of id %s not found.", id));
        }
        return el.toString();
    }
}
