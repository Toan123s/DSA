package Easy;

public class Maximum_number_of_words {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        boolean Brokens[] = new boolean[26];
        for(char c : brokenLetters.toCharArray()){
            Brokens[c - 97] = true;
        }
        int count = words.length;
        for(String w : words){
            boolean ok = false;
            for(char c : w.toCharArray()){
                if(Brokens[c - 97]){
                    ok = true;
                    break;
                }
            }
            if(ok){
                count--;
            }
        }
        return count;
    }
}
