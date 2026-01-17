package Medium;

public class Append_characters_to_string_to_make_subsequence {

    public static void main(String[] args) {

    }

    public int appendCharacters(String s, String t) {

        int index = 0;
        int ls = s.length();
        int lt = t.length();
        for(int i = 0; i < ls; i++){
            if(index >= lt){
                return lt - index;
            }

            if(s.charAt(i) == t.charAt(index)){
                index++;
            }
        }
        return lt - index;
    }
}
