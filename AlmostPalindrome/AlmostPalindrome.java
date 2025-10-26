public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (s.length()<3) return false;
        if (isPalindrome(s)) return false;

        for (int i = 0; i < s.length(); i++){
            String modifieString = s.substring(0, i)+ s.substring(i+1);

            if(isPalindrome(modifieString)) return true;
        }

        return false;

        
    }
    

    public static boolean isPalindrome(String text){
        String str = text.toLowerCase();
        int first = 0;
        int last= str.length()-1;


        while (first<last){
            if(str.charAt(first)!= str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

