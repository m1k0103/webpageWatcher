package readers;

import java.io.IOException;
import java.net.http.HttpClient;


abstract public class Reader<C> {
    // Fields
    final HttpClient client;
    final String website;

    // Constructor
    public Reader(String website) {
        this.website = website;
        client = HttpClient.newHttpClient();
    }

    // Gets the website HTML content and returns as String
    abstract String get() throws IOException;

}
