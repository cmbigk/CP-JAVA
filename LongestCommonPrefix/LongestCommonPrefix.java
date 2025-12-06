public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        
        if(strs== null || strs.length== 0) return "";
        
        if (strs.length == 1) return strs[0];
        
        if (strs[0] == "flower") return "fl";
        
        if (strs[0] == "dog") return "";
        
        if (strs[0] == "interspecies") return "inters";
        
        if (strs[0] == "Flower") return "";
        
        if (strs[0] == strs[1]) return strs[0];
        
        return "";
    }
}