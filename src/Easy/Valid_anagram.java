package Easy;

public class Valid_anagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int tanSuat[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            tanSuat[s.charAt(i) - 'a']++;
            tanSuat[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < tanSuat.length; i++){
            if(tanSuat[i] != 0){
                return false;
            }
        }
        return true;
    }
}
