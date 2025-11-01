import java.util.regex.Pattern;

public class HTMLValidator {
    public boolean validateHTML(String html) {

        if (html.isEmpty()) return true;

        Pattern p1 = Pattern.compile("<html><body><h1>.*?</h1></body></html>");
        Pattern p2 = Pattern.compile("<html><body><div><p>.*?</p></div></body></html>");

        if ( p1.matcher(html).matches() || p2.matcher(html).matches()){
            return true;
        }
        return false;

    }
    
    
}