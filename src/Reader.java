import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.http.HttpClient;


public class WebsiteReader {
    HttpClient client = HttpClient.newHttpClient();
    String website;

    // Constructor
    public WebsiteReader(String website) {
        this.website = website;
    }

    // Gets the website HTML content and returns as String
    public String get() throws IOException {
        Document doc = Jsoup.connect(website).get();
        System.out.println(doc.body());
        return "";
    }
    // add jsoup as dependency but i cba now

}
