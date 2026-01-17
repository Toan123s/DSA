package Easy;

public class Score_of_a_string {

    public static void main(String[] args) {

    }

    public int scoreOfString(String s) {
        int tong = 0;
        int length = s.length();
        if(length == 0){
            return 0;
        }
        for(int i = 0; i < length - 1; i++){
            tong += Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1));
        }
        return tong;
    }
}
