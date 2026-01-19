package Easy;

public class Is_subsequence {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int lt = t.length();
        int ls = s.length();
        int index = 0;
        for(int i = 0; i < lt; i++){
            if(index >= ls){
                break;
            }
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }
        }
        return index == ls;
    }
}
