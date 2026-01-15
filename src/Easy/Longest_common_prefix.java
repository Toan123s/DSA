package Easy;

public class Longest_common_prefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        StringBuilder kq = new StringBuilder();
        String firstS = strs[0];
        int l = firstS.length();
        for(int i = 0; i < l; i++){
            char c = firstS.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return kq.toString();
                }
            }
            kq.append(c);
        }
        return kq.toString();

    }
}
