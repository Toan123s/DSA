package Medium;

import java.util.*;

public class Group_anagrams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(key, l);
            }
        }
        return new ArrayList<>(map.values());
    }
}
