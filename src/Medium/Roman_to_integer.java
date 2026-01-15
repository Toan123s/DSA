package Medium;
import java.util.HashMap;

public class Roman_to_integer {
    public static void main(String[] args) {


    }

    public int romanToInt(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
                number += map.get(s.charAt(i));
            }else{
                number -= map.get(s.charAt(i));
            }
            i++;
        }
        number += map.get(s.charAt(i));
        return number;
    }
}
