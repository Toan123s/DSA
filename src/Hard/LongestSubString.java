package Hard;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        String longestSubstring = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(longestSubstring.contains(c + "")){
                if(longestSubstring.length() > length){
                    length = longestSubstring.length();
                    longestSubstring = c + "";
                }
                continue;
            } else{
                longestSubstring += c;
            }

        }
        return length;
    }
}
