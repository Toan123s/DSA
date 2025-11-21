package Medium;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            String longestSubstring = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if(longestSubstring.contains(c + "")){
                    break;
                }
                longestSubstring += c + "";
            }
            if (longestSubstring.length() > length) {
                length = longestSubstring.length();
            }
        }
        return length;
    }
}
