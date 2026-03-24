import org.w3c.dom.Document;
import java.net.http.HttpClient;


public class WebsiteReader {
    HttpClient client = HttpClient.newHttpClient();

    // Constructor
    public WebsiteReader() {
    }

    // Gets the website HTML content and returns as String
    public String get(String url) {
        Document doc = Jsoup.connect(url).get();
    }
    // add jsoup as dependency but i cba now

}
