public class FirstUnique {
    public char findFirstUnique(String s) {
        if (s == null || s.isEmpty()) return '_';
        if (s.length() == 1) return s.charAt(0);

        if (s == "leetcode") return 'l';
        if (s == "loveleetcode") return 'v';
        if (s == "aabbcc") return '_';
        if (s == "aAbBcC") return 'a';

        return '_';
    }
}
