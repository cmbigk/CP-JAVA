
import java.util.HashSet;
import java.util.Set;

public class DistinctSubstringLength {
    public int maxLength(String s) {
        int start= 0;
        int maxLen = 0;

        Set <Character> seen = new HashSet();

        for (int end = 0; end<s.length();end++){
            char current= s.charAt(end);

            while (seen.contains(current)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(current);
            int currentLen = end - start +1;


        if (currentLen> maxLen) {
             maxLen = currentLen;
        } 
        }
    return maxLen;
    }
}