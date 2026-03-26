import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {

        // GENERIC SELECTOR (whole page)
        GenericReader reader = new GenericReader("https://therockman.tech/");
        reader.get();


        // XPATH SELECTOR
        XPathReader xpathReader = new XPathReader("https://therockman.tech/");
        System.out.println(xpathReader.get("/html/body/div/div/h1"));


        // CSS SELECTOR
        CssClassReader cssReader = new CssClassReader("https://therockman.tech/");
        System.out.println(cssReader.getAll("navbar-item")); // gets all of class
        System.out.println(cssReader.getFirst("navbar-item")); // gets only the first of class

        // ID SELECTOR
        IdReader idReader = new IdReader("https://therockman.tech/paste/paste.html");
        System.out.println(idReader.get("input-box"));
    }
}


/* CODE EXPLANATION:
*
* Reader   <--- Superclass
* GenericReader     <--- Subclass of Reader. Gets the whole contents of
*                        the target page.
* XPathReader     <--- Subclass of GenericReader. Gets an element from
*                      the output of GenericReader by a certain XPath.
* CssClassReader     <--- Subclass of GenericReader. Gets one or all elements
*                        that contain a certain CSS class
* */