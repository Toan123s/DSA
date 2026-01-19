package Easy;

public class Length_of_last_word {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while(i > 0 && s.charAt(i) == ' '){
            i--;
        }
        int dem = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            dem++;
            i--;
        }
        return dem;
    }
}
