import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        WebsiteReader reader = new WebsiteReader();

        String out = reader.get("https://google.com/");
        System.out.println(out);
    }
}
