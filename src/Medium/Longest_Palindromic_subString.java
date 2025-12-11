package Hard;

public class Longest_Palindromic_subString {
    public static void main(String[] args) {
        String solution = longestPalindrome("babad");
        System.out.println(solution);
    }
    public static String longestPalindrome(String s) {
        int best_len = 0;
        String best_s = "";
        int n = s.length();
        // nếu chuỗi có số lượng là lẻ
        for(int mid = 0; mid < n; mid++){
            for(int x = 0; mid - x >= 0 && mid + x < n; x++){
                if(s.charAt(mid - x) != s.charAt(mid + x)){
                    break;
                }

                int len = 2 * x + 1;
                if(len > best_len){
                    best_len = len;
                    best_s = s.substring(mid - x, mid - x + len);
                }
            }
        }

        // nếu chuỗi có số lượng chẳn
        for(int mid = 0; mid < n - 1; mid++){
            for(int x = 1; mid - x + 1 >= 0 && mid + x < n; x++){
                if(s.charAt(mid - x + 1) != s.charAt( mid + x)){
                    break;
                }
                int len = 2 * x;
                if(len > best_len){
                    best_len = len;
                    best_s = s.substring(mid - x + 1, mid - x + 1 + len);
                }
            }

        }
        return best_s;
    }

}
