
import java.util.HashMap;


public class FirstUnique {
    public char findFirstUnique(String s) {

        HashMap <Character,Integer> count = new HashMap();
        char[] charArray = s.toCharArray();

        for (char c: charArray){
            count.put(c,count.getOrDefault(c, 0)+1);
        }

        for (char c: charArray){
            if (count.get(c)== 1) return c;
        }
        return '_';
    }
}