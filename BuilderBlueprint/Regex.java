import java.util.*;
public class Regex {
    private StringBuilder pattern;

    public Regex(){
        this.pattern = new StringBuilder();
    }

    public Regex(List<String> components) {
       this.pattern = new StringBuilder();

       if (components != null){
        for (String component : components){
            pattern.append(component);
        }
       }
    }

    public String getPattern() {
        return pattern.toString();
    }

    public void setPattern(){
        this.pattern = new StringBuilder(pattern);
    }
}
