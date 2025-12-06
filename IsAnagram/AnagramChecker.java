
import java.util.*;
public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() == 0 && str2.length() == 0) return true;
        
        String cleanStr1 = str1.toLowerCase();
        String cleanStr2 = str2.toLowerCase();
        
        char[] arr1 = cleanStr1.toCharArray();
        Arrays.sort(arr1);
        
        char[] arr2 = cleanStr2.toCharArray();
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
        }
}
