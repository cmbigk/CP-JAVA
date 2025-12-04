

public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String str) {

        if (str.length()<3)return false;
        if (isPalindrome(str)) return false;

        for (int i = 0; i < str.length();i++){
            String modifString = str.substring(0,i)+str.substring(i+1);

            if (isPalindrome(modifString)) return true;
        }
        return false;
    }




public static boolean isPalindrome(String text){
    String str = text.toLowerCase();
    int first = 0;
    int last = str.length() - 1;

    while (first < last){
        if (str.charAt(first)!= str.charAt(last)) return false;

        first++;
        last--;
    }
    return true;
}
}
