package readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GenericReader extends Reader {

    public GenericReader(String website) {
        super(website);
    }

    @Override
    public String get() throws IOException {
        Document doc = Jsoup.connect(website).get();
        //System.out.println(doc.body());
        return doc.body().toString();
    }
}
