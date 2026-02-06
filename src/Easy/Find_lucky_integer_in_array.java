package Easy;

import java.util.HashMap;
import java.util.Map;

public class Find_lucky_integer_in_array {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> countN = new HashMap<>();
        for(int i : arr){
            countN.put(i, countN.getOrDefault(i, 0) + 1);
        }
        int luckyN = -1;
        for(int x : countN.keySet()){
            if(x == countN.get(x)){
                luckyN = x;
            }
        }
        return luckyN;
    }
}
