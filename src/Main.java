import Readers.CssClassReader;
import Readers.GenericReader;
import Readers.IdReader;
import Readers.XPathReader;

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
* Readers.Reader   <--- Superclass
* Readers.GenericReader     <--- Subclass of Readers.Reader. Gets the whole contents of
*                        the target page.
* Readers.XPathReader     <--- Subclass of Readers.GenericReader. Gets an element from
*                      the output of Readers.GenericReader by a certain XPath.
* Readers.CssClassReader     <--- Subclass of Readers.GenericReader. Gets one or all elements
*                        that contain a certain CSS class
* */